package xyz.yyaxu.withweather.gson;

/**
 * Time:2021/5/31
 * Describle:
 **/
public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
