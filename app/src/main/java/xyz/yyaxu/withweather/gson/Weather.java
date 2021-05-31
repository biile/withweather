package xyz.yyaxu.withweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Time:2021/5/31
 * Describle:
 **/
public class Weather {
    public String status;  //返回是否成功返回值
    public Basic basic;
    public Forecast forecast;
    public AQI aqi;
    public Now now;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;  //解析出数组
    public Suggestion suggestion;
}
