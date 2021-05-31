package xyz.yyaxu.withweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Time:2021/5/31
 * Describle:
 **/
public class Forecast {
    public String data;
    @SerializedName("tmp")
    public Temperature temperature;
    @SerializedName("cond")
    public More more;
    public int date;

    public class Temperature {
        public  String max;
        public String min;
    }
    public class More {
        @SerializedName("txt_d")
        public String info;
    }

}
