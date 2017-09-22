package com.farukydnn.weatherplus.model;

import com.google.gson.annotations.SerializedName;


public class Main {

    @SerializedName("temp")
    private float temp;

    @SerializedName("pressure")
    private int pressure;

    @SerializedName("humidity")
    private int humidity;

    @SerializedName("temp_min")
    private int tempMin;

    @SerializedName("temp_max")
    private int tempMax;


    public float getTemp() {
        return temp;
    }

    public int getPressure() {
        return pressure;
    }

    public int getHumidity() {
        return humidity;
    }

    public int getTempMin() {
        return tempMin;
    }

    public int getTempMax() {
        return tempMax;
    }
}
