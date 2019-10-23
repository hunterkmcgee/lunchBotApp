package com.example.testjavaapp.backend.request.api;
import java.io.*;
import java.util.*;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JSONConvert
{
    public JSONConvert(String response) throws JSONException {
        //String json = "";
        String test[] = new String[20];
        Gson gs1 = new Gson();
        JSONObject obj = new JSONObject(response);
        JSONArray pageName = obj.getJSONArray("businesses");
        for(int i =0; i < pageName.length(); i++)
        {
            JSONObject aye = pageName.getJSONObject(i);
            test[i] = aye.getString("name")+" " + aye.getString("rating")+" "+ aye.getString("image_url");
        }
            //json = (response.replace("\"", "\\\""));
            //System.out.println(json);

        ResponseObj resp = gs1.fromJson(response, ResponseObj.class);
        ResponseObj.Category cat = gs1.fromJson(response, ResponseObj.Category.class);
        String resp1 = gs1.toJson(resp);

        for(int i = 0; i < pageName.length(); i++)
        {
            System.out.println(test[i]);
        }
    }
}