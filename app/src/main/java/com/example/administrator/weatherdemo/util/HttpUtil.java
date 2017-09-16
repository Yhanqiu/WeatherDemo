package com.example.administrator.weatherdemo.util;

/**
 * Created by Administrator on 2017/9/16.
 */

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
//    public static void sendHttpRequest(final String address, final HttpCallbackListener listner){
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                HttpURLConnection connection = null;
//                try{
//                    URL url = new URL(address);
//                    connection = (HttpURLConnection) url.openConnection();
//                    connection.setRequestMethod("GET");
//                    connection.setConnectTimeout(8000);
//                    connection.setReadTimeout(8000);
//                    connection.setDoInput(true);
//                    connection.setDoOutput(true);
//                    InputStream in = connection.getInputStream();
//                    BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//                    StringBuilder response = new StringBuilder();
//                    String line = "";
//                    while ((line = reader.readLine())!=null) {
//                        response.append(line);
//                    }
//                    if(listner!=null){
//                        listner.onFinish(response.toString());
//                    }
//                }catch (Exception e){
//                    e.printStackTrace();
//                    if(listner!=null) {
//                        listner.onError(e);
//                    }
//                }finally {
//                    if(connection!=null) connection.disconnect();
//                }
//            }
//        }).start();
//    }

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback){
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }
}
