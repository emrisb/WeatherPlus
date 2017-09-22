package com.farukydnn.weatherplus.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;


public class CityList {

    @SerializedName("cnt")
    private int cityCount;

    @SerializedName("list")
    private List<SingleCity> cities = null;


    public int getCityCount() {
        return cityCount;
    }

    public List<SingleCity> getCityList() {
        return cities;
    }
}
