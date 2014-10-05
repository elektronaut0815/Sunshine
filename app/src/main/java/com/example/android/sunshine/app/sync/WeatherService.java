package com.example.android.sunshine.app.sync;

import retrofit.client.Response;
import retrofit.http.GET;
import retrofit.http.Query;

public interface WeatherService {

    @GET("/")
    public Response getForecast(@Query("q") String cityCode, @Query("mode") String format, @Query("units") String units, @Query("cnt") String days);
}
