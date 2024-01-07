package com.example.ltudddapplication.Tuan4

import android.content.Context
import android.widget.TextView
import com.android.volley.Response
import com.android.volley.toolbox.JsonArrayRequest
import com.android.volley.toolbox.Volley

class Tuan4_Volley_Kottlin {
    var strJSON = "";
    fun getJSONArrayObjectts(context : Context, textView : TextView)
    {
        val queue = Volley.newRequestQueue(context);
        val url = "https://store1810.000webhostapp.com/";
        val request = JsonArrayRequest(
                url,
                Response.Listener {
                    response ->
                    for (i in 0 until response.length())
                    {
                        val person = response.getJSONObject(i)
                        val name: String = person.getString("name")
                        val price: String = person.getString("price")

                        strJSON += "Name: $name\n"
                        strJSON += "Price: $price\n"
                    }
                    textView.text = strJSON
                },
                Response.ErrorListener {
                    error ->  textView.text = error.message;
                }
        );

        queue.add(request)
    }
}