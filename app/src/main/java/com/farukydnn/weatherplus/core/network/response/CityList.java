package com.farukydnn.weatherplus.core.network.response;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CityList extends BaseResponse {

    @SerializedName("cnt")
    private int cityCount;

    @SerializedName("list")
    private List<SingleCity> cities;


    public int getCityCount() {
        return cityCount;
    }

    public List<SingleCity> getCityList() {
        return cities;
    }
}
