package com.fengwenyi.okhttp;

import com.alibaba.fastjson.JSON;
import okhttp3.*;

import java.io.IOException;

/**
 * @author Wenyi Feng
 * @since 2019-01-10
 */
public class Post {

    public static void main(String[] args) {
        String url = "http://localhost:8080/api/post";
        MediaType mediaType = MediaType.parse("application/json; charset=UTF-8");
        User user = new User()
                .setName("Zhangsan")
                .setAge(20);
        String param = JSON.toJSONString(user);
        OkHttpClient okHttpClient = new OkHttpClient();
        Request request = new Request.Builder()
                .url(url)
                .post(RequestBody.create(mediaType, param))
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
