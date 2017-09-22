package com.farukydnn.weatherplus.model;

import com.google.gson.annotations.SerializedName;


public class SingleCity {

    @SerializedName("coord")
    private Coord coord;

    @SerializedName("sys")
    private Sys sys;

    @SerializedName("weather")
    private java.util.List<Weather> weather = null;
    @SerializedName("main")
    private Main main;

    @SerializedName("visibility")
    private int visibility;

    @SerializedName("wind")
    private Wind wind;

    @SerializedName("clouds")
    private Clouds clouds;

    @SerializedName("dt")
    private int dt;

    @SerializedName("id")
    private int id;

    @SerializedName("name")
    private String name;


    public Coord getCoord() {
        return coord;
    }

    public Sys getSys() {
        return sys;
    }

    public java.util.List<Weather> getWeather() {
        return weather;
    }

    public Main getMain() {
        return main;
    }

    public int getVisibility() {
        return visibility;
    }

    public Wind getWind() {
        return wind;
    }

    public Clouds getClouds() {
        return clouds;
    }

    public int getDt() {
        return dt;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
