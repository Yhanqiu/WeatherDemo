package com.example.administrator.weatherdemo.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Administrator on 2017/9/16.
 */

public class Basic {
    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;
    public UpDate update;

    public class UpDate{
        @SerializedName("loc")
        public String updateTime;
    }
}
