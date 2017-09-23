package com.farukydnn.weatherplus.core.network.dto;

import com.google.gson.annotations.SerializedName;


public class Clouds {

    @SerializedName("all")
    private int cloudiness;


    public int getCloudiness() {
        return cloudiness;
    }

}
