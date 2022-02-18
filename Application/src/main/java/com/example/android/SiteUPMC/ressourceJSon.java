package com.example.android.SiteUPMC;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;


public class ressourceJSon {
    static String raw = "jsonp1645104676010([{\"id\":561271,\"start\":\"2022-02-24T08:30:00.000+10:00\",\"end\":\"2022-02-24T10:30:00.000+10:00\",\"title\":\"[G2][G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2][G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : AMPHI.34A\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-CC\",\"avaibleGroupId\":\"1\",\"salle\":\"AMPHI.34A\"},{\"id\":561649,\"start\":\"2022-02-17T13:45:00.000+10:00\",\"end\":\"2022-02-17T15:45:00.000+10:00\",\"title\":\" LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\" LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : AMPHI.24\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-CM\",\"avaibleGroupId\":\"0\",\"salle\":\"AMPHI.24\"},{\"id\":561652,\"start\":\"2022-02-17T08:30:00.000+10:00\",\"end\":\"2022-02-17T10:30:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : 14.24.109\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"14.24.109\"},{\"id\":561653,\"start\":\"2022-02-17T08:30:00.000+10:00\",\"end\":\"2022-02-17T10:30:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : 14.24.209\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"14.24.209\"},{\"id\":561660,\"start\":\"2022-02-24T13:45:00.000+10:00\",\"end\":\"2022-02-24T15:45:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"ANNULE\"},{\"id\":561661,\"start\":\"2022-02-24T13:45:00.000+10:00\",\"end\":\"2022-02-24T15:45:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"ANNULE\"},{\"id\":561678,\"start\":\"2022-02-18T13:45:00.000+10:00\",\"end\":\"2022-02-18T15:45:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"ANNULE\"},{\"id\":561678,\"start\":\"2022-02-25T13:45:00.000+10:00\",\"end\":\"2022-02-25T15:45:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"ANNULE\"},{\"id\":561679,\"start\":\"2022-02-18T13:45:00.000+10:00\",\"end\":\"2022-02-18T15:45:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"ANNULE\"},{\"id\":561679,\"start\":\"2022-02-25T13:45:00.000+10:00\",\"end\":\"2022-02-25T15:45:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"ANNULE\"},{\"id\":561782,\"start\":\"2022-02-17T13:45:00.000+10:00\",\"end\":\"2022-02-17T15:45:00.000+10:00\",\"title\":\" LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\" LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-CM\",\"avaibleGroupId\":\"0\",\"salle\":\"ANNULE\"},{\"id\":561785,\"start\":\"2022-02-17T08:30:00.000+10:00\",\"end\":\"2022-02-17T10:30:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"ANNULE\"},{\"id\":561786,\"start\":\"2022-02-17T08:30:00.000+10:00\",\"end\":\"2022-02-17T10:30:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"ANNULE\"},{\"id\":561793,\"start\":\"2022-02-24T13:45:00.000+10:00\",\"end\":\"2022-02-24T15:45:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : 14.24.107\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"14.24.107\"},{\"id\":561794,\"start\":\"2022-02-24T13:45:00.000+10:00\",\"end\":\"2022-02-24T15:45:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : 14.24.109\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"14.24.109\"},{\"id\":561811,\"start\":\"2022-02-18T13:45:00.000+10:00\",\"end\":\"2022-02-18T15:45:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : 14.24.107\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"14.24.107\"},{\"id\":561811,\"start\":\"2022-02-25T13:45:00.000+10:00\",\"end\":\"2022-02-25T15:45:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : 14.24.107\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"14.24.107\"},{\"id\":561812,\"start\":\"2022-02-18T13:45:00.000+10:00\",\"end\":\"2022-02-18T15:45:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : 14.24.109\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"14.24.109\"},{\"id\":561812,\"start\":\"2022-02-25T13:45:00.000+10:00\",\"end\":\"2022-02-25T15:45:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : 14.24.109\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"14.24.109\"},{\"id\":561915,\"start\":\"2022-02-17T13:45:00.000+10:00\",\"end\":\"2022-02-17T15:45:00.000+10:00\",\"title\":\" LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\" LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-CM\",\"avaibleGroupId\":\"0\",\"salle\":\"ANNULE\"},{\"id\":561918,\"start\":\"2022-02-17T08:30:00.000+10:00\",\"end\":\"2022-02-17T10:30:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"ANNULE\"},{\"id\":561919,\"start\":\"2022-02-17T08:30:00.000+10:00\",\"end\":\"2022-02-17T10:30:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"ANNULE\"},{\"id\":561926,\"start\":\"2022-02-24T13:45:00.000+10:00\",\"end\":\"2022-02-24T15:45:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"ANNULE\"},{\"id\":561927,\"start\":\"2022-02-24T13:45:00.000+10:00\",\"end\":\"2022-02-24T15:45:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"ANNULE\"},{\"id\":561944,\"start\":\"2022-02-18T13:45:00.000+10:00\",\"end\":\"2022-02-18T15:45:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"ANNULE\"},{\"id\":561944,\"start\":\"2022-02-25T13:45:00.000+10:00\",\"end\":\"2022-02-25T15:45:00.000+10:00\",\"title\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G1] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"1\",\"salle\":\"ANNULE\"},{\"id\":561945,\"start\":\"2022-02-18T13:45:00.000+10:00\",\"end\":\"2022-02-18T15:45:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"ANNULE\"},{\"id\":561945,\"start\":\"2022-02-25T13:45:00.000+10:00\",\"end\":\"2022-02-25T15:45:00.000+10:00\",\"title\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\"[G2] LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : ANNULE\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-AUTRE\",\"avaibleGroupId\":\"2\",\"salle\":\"ANNULE\"},{\"id\":570762,\"start\":\"2022-02-16T18:30:00.000+10:00\",\"end\":\"2022-02-16T20:00:00.000+10:00\",\"title\":\" LU2PY313 - Outils mathématiques \",\"description\":\" LU2PY313 - Outils mathématiques   - Salle : 24.34.107\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-CC\",\"avaibleGroupId\":\"0\",\"salle\":\"24.34.107\"},{\"id\":571413,\"start\":\"2022-02-24T08:30:00.000+10:00\",\"end\":\"2022-02-24T12:45:00.000+10:00\",\"title\":\" LU2PY321 - Electromagnétisme 1 (MIN) \",\"description\":\" LU2PY321 - Electromagnétisme 1 (MIN)   - Salle : AMPHI.B3\",\"readOnly\":true,\"url\":\"#popupResa\",\"className\":\"eventDisplay-CC\",\"avaibleGroupId\":\"0\",\"salle\":\"AMPHI.B3\"}])";
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
        ressourceJSon.raw = raw;
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
