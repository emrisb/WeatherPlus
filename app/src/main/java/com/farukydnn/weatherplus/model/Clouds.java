package com.farukydnn.weatherplus.model;

import com.google.gson.annotations.SerializedName;


public class Clouds {

    @SerializedName("all")
    private int cloudiness;


    public int getCloudiness() {
        return cloudiness;
    }

}
