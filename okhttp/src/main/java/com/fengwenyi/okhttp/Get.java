package com.fengwenyi.okhttp;

import okhttp3.*;

import java.io.IOException;

/**
 * @author Wenyi Feng
 * @since 2019-01-10
 */
public class Get {

    public static void main(String[] args) {
        String url = "http://localhost:8080/api/get";
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .get()
                .addHeader("Content-Type", "application/json; charset=UTF-8")
                .build();
        Call call = okHttpClient.newCall(request);
        call.enqueue(new Callback() {
            @Override
            public void onFailure(Call call, IOException e) {
                System.out.println("onFailure: " + e.getMessage());
            }

            @Override
            public void onResponse(Call call, Response response) throws IOException {
                System.out.println("onResponse: " + response.body().string());
            }
        });
    }

}
