package com.farukydnn.weatherplus.core.network.dto;

import com.google.gson.annotations.SerializedName;


public class Wind {

    @SerializedName("speed")
    private float speed;

    @SerializedName("deg")
    private int deg;


    public float getSpeed() {
        return speed;
    }

    public int getDeg() {
        return deg;
    }
}
