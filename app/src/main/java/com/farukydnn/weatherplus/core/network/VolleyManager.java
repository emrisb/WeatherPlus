package com.farukydnn.weatherplus.core.network;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.farukydnn.weatherplus.app.AppController;
import com.farukydnn.weatherplus.core.network.interfaces.OnResponse;
import com.farukydnn.weatherplus.core.network.response.BaseResponse;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 23.09.2017                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/
public class VolleyManager implements Response.ErrorListener, Response.Listener<String> {

    private OnResponse onResponse = null;
    private Class<? extends BaseResponse> responseClass = null;

    public void sendRequest(String url, OnResponse onResponse, Class<? extends BaseResponse> responseClass) {

        this.onResponse = onResponse;
        this.responseClass = responseClass;

        StringRequest stringRequest = new StringRequest(url, this, this);

        AppController.getInstance().addToRequestQueue(stringRequest, responseClass.getSimpleName());
    }

    @Override
    public void onErrorResponse(VolleyError error) {

        onResponse.onErrorResponse(error, responseClass);
    }

    @Override
    public void onResponse(String response) {

        GsonBuilder gsonBuilder = new GsonBuilder();

        Gson gson = gsonBuilder.create();

        if (!response.startsWith("{")) {
            response = "{\"object\":" + response + "}";
        }

        BaseResponse baseResponse = gson.fromJson(response, responseClass);
        onResponse.onSuccessResponse(baseResponse);
    }
}
