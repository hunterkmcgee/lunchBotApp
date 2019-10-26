package com.backend;

import android.annotation.SuppressLint;
import android.os.AsyncTask;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;


import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class yelpApiCall{
    @SuppressLint("StaticFieldLeak")
    public static class asshole extends AsyncTask<String,String,String>{

        private String typeOfFood;
        private String place;

        public asshole(String foodType, String location) {
            this.typeOfFood = foodType;
            this.place = location;
        }

        @Override
        protected String doInBackground(String... strings) {
            String output = "";
            OkHttpClient client = new OkHttpClient();
            String apiKey = "Bearer *apiKey*";
            HttpUrl.Builder urlBuilder = HttpUrl.parse("https://api.yelp.com/v3/businesses/search").newBuilder();
            urlBuilder.addQueryParameter("term", this.typeOfFood);
           // urlBuilder.addQueryParameter("location", this.place);
            urlBuilder.addQueryParameter("latitude","35.846222");
            urlBuilder.addQueryParameter("longitude","-86.369279");
            urlBuilder.addQueryParameter("limit", "20");
            String url = urlBuilder.build().toString();
            Request request = new Request.Builder()
                    .header("Authorization", apiKey)
                    .url(url)
                    .build();
            try {
                Response response = client.newCall(request).execute();
                System.out.println("hello");
                return response.body().string();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return output;
        }

        /*
        public void sendSearch() throws IOException {
            OkHttpClient client = new OkHttpClient();
            String apiKey = "Bearer zNM2fuSJJkJbyIua7T0Yl468_PT3Xhsan1tmmwcXE90rvgoEl3TClYAVb2medEZe1dzReYkmXQoSL0-PmhTzVE8nZRO1BuA_3iHYU090KIwXqd7jy7JnTl0sdrxyXXYx";
            HttpUrl.Builder urlBuilder = HttpUrl.parse("https://api.yelp.com/v3/businesses/search").newBuilder();
            urlBuilder.addQueryParameter("term", this.typeOfFood);
            String url = urlBuilder.build().toString();
            Request request = new Request.Builder()
                    .header("Authorization", apiKey)
                    .url(url)
                    .build();
            Response response = client.newCall(request).execute();
            //System.out.println(response.body().string());
        }
         */
    }
}
