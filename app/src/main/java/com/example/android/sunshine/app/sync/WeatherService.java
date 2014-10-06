package com.example.android.sunshine.app.sync;

import com.example.android.sunshine.app.Forecast;

import retrofit.http.GET;
import retrofit.http.Query;

public interface WeatherService {

    @GET("/")
    public Forecast getForecast(@Query("q") String cityCode, @Query("mode") String format, @Query("units") String units, @Query("cnt") String days);
}
