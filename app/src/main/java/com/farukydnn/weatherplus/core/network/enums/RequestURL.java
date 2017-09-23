package com.farukydnn.weatherplus.core.network.enums;

/******************************
 * Created by Gökhan ÖZTÜRK   |
 * 23.09.2017                 |
 * GokhanOzturk@AndroidEdu.IO |
 *****************************/
public enum RequestURL {

    BaseURL{
        @Override
        public String toString() {
            return "http://api.openweathermap.org/data/2.5/";
        }
    },

    Weather{
        @Override
        public String toString() {
            return "weather?q=";
        }
    }
}
