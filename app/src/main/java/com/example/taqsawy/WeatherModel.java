package com.example.taqsawy;

public class WeatherModel {
    String city,status,icon,last_update,winddir;
    double temp,wind;
    int humidity;

    public WeatherModel() {
    }

    public WeatherModel(String city, double temp, String status, String icon, String last_update, double wind, String winddir, int humidity) {
        this.city = city;
        this.temp = temp;
        this.status = status;
        this.icon = icon;
        this.last_update = last_update;
        this.wind = wind;
        this.winddir = winddir;
        this.humidity = humidity;
    }
}
