package xyz.yyaxu.withweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Time:2021/5/31
 * Describle: 显示城市的基础信息
 **/
public class Basic {
    @SerializedName("city")             //JSON字段和Java字段建立映射
    public String cityName;             //城市名

    @SerializedName("id")
    public String weather_id;            //天气情况

    @SerializedName("update")
    public Update update;
    public class Update {
        @SerializedName("loc")
        public String updateTime;       //天气更新时间
    }
}
