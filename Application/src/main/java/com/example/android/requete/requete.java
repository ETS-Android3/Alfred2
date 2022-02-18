package com.example.android.requete;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.android.volley.DefaultRetryPolicy;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.example.android.SiteUPMC.ressourceJSon;
import com.example.android.recyclerview.RecyclerViewFragment;

import org.json.JSONArray;
import org.json.JSONObject;

public class requete  {

    private String rawText = new String();
    private JSONArray JSonEDT = new JSONArray();
    private String URL = new String();

    RequestQueue queue;

    public requete(Context context, String formation){
        URL = "http://planning.admp6.jussieu.fr/jsoncal.aspx?code="+formation;
        //URL ="https://www.google.com";
        queue = Volley.newRequestQueue(context);

    }

    public String getStringEDT(){
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        rawText = response;
                        Log.i("requete",rawText);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                rawText="That didn't work!";
                Log.e("requete","Erreur lors de la tentative de recuperation des donnees du site");
                Log.e("requete",error.toString());
            }
        });

//      Add the request to the RequestQueue.
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                10000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(stringRequest);
        Log.i("requete",rawText);
        return rawText;
    }

    public void getEDT(RecyclerViewFragment recyclerView, ressourceJSon res){
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, URL,
                new Response.Listener<String>() {
                    @SuppressLint("NewApi")
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        rawText = response;
                        res.setRaw(rawText);
                        recyclerView.initEDT(res.getEDT());
                        recyclerView.mAdapter.notifyDataSetChanged();
                        Log.i("requete",rawText);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                rawText="That didn't work!";
                Log.e("requete","Erreur lors de la tentative de recuperation des donnees du site");
                Log.e("requete",error.toString());
            }
        });

//      Add the request to the RequestQueue.
        stringRequest.setRetryPolicy(new DefaultRetryPolicy(
                10000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(stringRequest);

    }

    public void getJSonEDT(RecyclerViewFragment recyclerView, ressourceJSon res){
        // Request a string response from the provided URL.
        JsonArrayRequest JsonRequest = new JsonArrayRequest(Request.Method.GET, URL,null
                ,new Response.Listener<JSONArray>() {
                    @RequiresApi(api = Build.VERSION_CODES.O)
                    @Override
                    public void onResponse(JSONArray response) {
                        JSonEDT = response;
//                        res.setRawJSon(response);
//                        recyclerView.mAdapter.EDT.clear();
//                        recyclerView.mAdapter.EDT=res.getEDT();
//                        recyclerView.initEDT(res.getEDT());
//                        recyclerView.getmAdapter().notifyDataSetChanged();
                        Log.i("requete",JSonEDT.toString());
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Log.e("requete","Erreur lors de la tentative de recuperation des donnees du site");
                Log.e("requete",error.toString());
            }
        });

//      Add the request to the RequestQueue.
        JsonRequest.setRetryPolicy(new DefaultRetryPolicy(
                10000,
                DefaultRetryPolicy.DEFAULT_MAX_RETRIES,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT));
        queue.add(JsonRequest);

    }
}

