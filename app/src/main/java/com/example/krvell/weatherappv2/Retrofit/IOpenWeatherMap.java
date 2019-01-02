package com.example.krvell.weatherappv2.Retrofit;

import com.example.krvell.weatherappv2.Model.WeatherResult;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface IOpenWeatherMap {
    @GET("weather")
    Observable<WeatherResult> getWeatherByLocation(@Query("lat") String lat,
                                                   @Query("lon") String lon,
                                                   @Query("appid") String appid,
                                                   @Query("units") String unit);
}
