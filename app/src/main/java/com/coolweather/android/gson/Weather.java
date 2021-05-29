package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Weather {

    public String status;//请求的状态 ok表示成功

    public Basic basic;//包含城市的基本信息

    public AQI aqi;//当前空气质量情况

    public Now now;//当前天气信息

    public Suggestion suggestion;//天气相关的生活建议

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList; //未来几天都天气信息
}
