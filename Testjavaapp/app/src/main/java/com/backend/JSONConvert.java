package com.backend;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;


public class JSONConvert
{
    final int MAX_REQEUST = 20;
    private String responseArray[] = new String[MAX_REQEUST];
    public JSONConvert(String response) throws JSONException {
        //String json = "";
        String test[] = new String[20];
        Gson gs1 = new Gson();
        JSONObject obj = new JSONObject(response);
        JSONArray pageName = obj.getJSONArray("businesses");
        for(int i =0; i < pageName.length(); i++)
        {
            JSONObject aye = pageName.getJSONObject(i);
            test[i] = "Name: " + aye.getString("name")+ ", Rating: " + aye.getString("rating");
        }
            //json = (response.replace("\"", "\\\""));
            //System.out.println(json);

        ResponseObj resp = gs1.fromJson(response, ResponseObj.class);
        ResponseObj.Category cat = gs1.fromJson(response, ResponseObj.Category.class);
        String resp1 = gs1.toJson(resp);
        responseArray = test;
        /*
        for(int i = 0; i < pageName.length(); i++)
        {
            System.out.println(test[i]);
        }

         */
    }
    public String[] getResponseArray(){
        return responseArray;
    }
}