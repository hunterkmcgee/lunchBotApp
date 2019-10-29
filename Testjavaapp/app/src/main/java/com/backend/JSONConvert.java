package com.backend;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class JSONConvert
{
    private List responseArray;
    public JSONConvert(String response) throws JSONException {
        //String json = "";
        List test = new ArrayList();
        Gson gs1 = new Gson();
        JSONObject obj = new JSONObject(response);
        JSONArray pageName = obj.getJSONArray("businesses");
        for(int i =0; i < pageName.length(); i++)
        {
            JSONObject aye = pageName.getJSONObject(i);
            test.add("Name: " + aye.getString("name") + ", Rating: " + aye.getString("rating"));
        }
            //json = (response.replace("\"", "\\\""));
            //System.out.println(json);
        responseArray = test;
        /*
        for(int i = 0; i < pageName.length(); i++)
        {
            System.out.println(test[i]);
        }

         */
    }
    public List getResponseArray(){
        return responseArray;
    }
    public String getOneRandom(){
        int rnd = new Random().nextInt(responseArray.size());
        return (String) responseArray.get(rnd);
    }
}