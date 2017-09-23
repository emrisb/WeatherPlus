package com.farukydnn.weatherplus.core.ui;

import android.support.v7.app.AppCompatActivity;

import com.farukydnn.weatherplus.core.network.VolleyManager;
import com.farukydnn.weatherplus.core.network.interfaces.OnResponse;
import com.farukydnn.weatherplus.core.network.response.BaseResponse;

/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 23.09.2017                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/
public class BaseActivity extends AppCompatActivity {

    public VolleyManager volleyManager = null;

    public void sendRequest(String url, OnResponse onResponse, Class<? extends BaseResponse> responseClass) {

        volleyManager = new VolleyManager();
        volleyManager.sendRequest(url, onResponse, responseClass);
    }
}
