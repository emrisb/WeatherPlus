package com.farukydnn.weatherplus;

import com.farukydnn.weatherplus.core.network.enums.RequestURL;
import com.farukydnn.weatherplus.core.network.interfaces.OnResponse;
import com.farukydnn.weatherplus.core.network.response.SingleCity;
import com.farukydnn.weatherplus.core.ui.BaseActivity;

/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 23.09.2017                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/
public class SendRequest {

    public void sendAddCityToList(BaseActivity baseActivity, String cityName, OnResponse onResponse){

        String url = RequestURL.BaseURL.toString()
                + RequestURL.Weather.toString()
                + cityName
                + "&units=metric&lang=tr&APPID=3b17492d0ec2d9ff74a940f6f6c30d10";

        baseActivity.sendRequest(url,onResponse, SingleCity.class);
    }
}
