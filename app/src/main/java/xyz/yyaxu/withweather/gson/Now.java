package xyz.yyaxu.withweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Time:2021/5/31
 * Describle:
 **/
public class Now {
    @SerializedName("tmp")
    public String tempeture;

    @SerializedName("cond")
    public More more;
    public class More {
        @SerializedName("txt")
        public String info;
    }
}
