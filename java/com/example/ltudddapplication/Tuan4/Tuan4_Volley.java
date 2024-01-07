package com.example.ltudddapplication.Tuan4;

import android.content.Context;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.ResponseDelivery;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Tuan4_Volley {

    String strJSON = "";
    public void getJsonArrayOfObject(Context context, TextView textView)
    {
        RequestQueue queue = Volley.newRequestQueue(context);

        String url = "https://store1810.000webhostapp.com/";
        JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(url,
            new Response.Listener<JSONArray>() {
                @Override
                public void onResponse(JSONArray response) {
                    for (int i = 0; i < response.length(); i++)
                    {
                        try {
                            JSONObject jsonObject = response.getJSONObject(i);

                            String name = jsonObject.getString("name");
                            String price = jsonObject.getString("price");

                            strJSON += "Name: " + name + "\n";
                            strJSON += "Price: " + price + "\n";
                        }
                        catch (JSONException e)
                        {
                            throw new RuntimeException(e);
                        }
                        textView.setText(strJSON);
                    }
                }
            },
            new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    textView.setText(error.getMessage());
                }
            }
        );

        // Thuc thi request
        queue.add(jsonArrayRequest);
    }
}
