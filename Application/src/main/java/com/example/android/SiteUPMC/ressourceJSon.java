package com.example.android.SiteUPMC;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class ressourceJSon {
     String raw = new String();
     String SJSon;
    public JSONArray rawJSon = new JSONArray();
    Cours Cours_EDT[];
    ArrayList<Cours> EDT = new ArrayList<Cours>();


    @RequiresApi(api = Build.VERSION_CODES.O)
    public ressourceJSon(){
        init();
        remplie();
        Log.i("ressourceJSon","JSon cree");
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void setRawJSon(JSONArray rawJSon) {
        this.rawJSon = rawJSon;
        remplie();
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void init(){
        SJSon = raw.replace("(", "");
        SJSon.replace(")", "");
        try {

            JSONArray EDT = new JSONArray(SJSon);
            Log.i("ressourceJSon", String.valueOf(EDT.length()));
            rawJSon = EDT;

        } catch (JSONException e) {
            Log.e("ressourceJSon","Erreur de transformation en JSon");
        }

        //Initialisation du tableau de cours
        Cours_EDT = new Cours[(int)rawJSon.length()];
        for (int i = 0; i < rawJSon.length(); i++) {
            Cours_EDT[i] = new Cours();
        }
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void remplie(){
        JSONObject temp = new JSONObject();
        for (int i=0; i<rawJSon.length();i++){
            try {
                temp = rawJSon.getJSONObject(i);
            } catch (JSONException e) {
                e.printStackTrace();
            }

            try {

                Cours_EDT[i].title=temp.getString("title");
                Cours_EDT[i].description=temp.getString("description");
                Cours_EDT[i].start=temp.getString("start");
                Cours_EDT[i].end=temp.getString("end");
                Cours_EDT[i].salle=temp.getString("salle");
                Cours_EDT[i].class_name=temp.getString("className");
                Cours_EDT[i].ID=temp.getInt("avaibleGroupId");
                //Cours_EDT[i].AfficherCours();
                EDT.add(Cours_EDT[i]);
                EDT.get(i).updateDate();

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public void setRaw(String raw) {
        this.raw = raw;
        init();
        remplie();
        Log.i("ressourceJSon","Json Actualise");
    }

    public ArrayList<Cours> getEDT(){
        ArrayList<Cours> res = new ArrayList<Cours>();
        for (int i = 0; i < EDT.size(); i++) {
            if (!EDT.get(i).isCoursAnnule()){
                //Log.i("ressourceJSon","getEDT:Cours pas annule");
                res.add(EDT.get(i));
            }
            else{
                //Log.e("ressourceJSon","getEDT:Cours annule");
                //EDT.get(i).AfficherCours();
            }
        }
        Log.i("ressourceJSon","return Array de taille :"+res.size());
        return res;
    }



}
