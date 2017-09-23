package com.farukydnn.weatherplus.core.network.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 23.09.2017                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/
public class ASDAS extends BaseResponse {

    @SerializedName("object")
    private List<CityList> object = null;
}
