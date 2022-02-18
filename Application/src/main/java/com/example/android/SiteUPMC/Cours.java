package com.example.android.SiteUPMC;

import static java.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME;

import android.os.Build;
import android.support.annotation.RequiresApi;
import android.util.Log;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Cours {
    public String title;
    public String description;
    public String salle;
    public String start;
    public String end;
    public String class_name;
    private LocalDateTime debut;
    private LocalDateTime fin;
    private DateTimeFormatter inputFormatter;
    private DateTimeFormatter outputFormatter;
    public int ID;

    @RequiresApi(api = Build.VERSION_CODES.O)
    Cours(){
        title = new String();
        description = new String();
        salle = new String();
        start = new String();
        end = new String();
        class_name = new String();
        ID = 0;
        inputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'+10:00'", Locale.ENGLISH);
        outputFormatter = DateTimeFormatter.ofPattern("HH:mm", Locale.ENGLISH);


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    void updateDate(){
        debut = LocalDateTime.parse(start, ISO_OFFSET_DATE_TIME);
        fin = LocalDateTime.parse(end,ISO_OFFSET_DATE_TIME );
        //Log.i("Cours","Date enregistre"+debut.toString());
    }

    public LocalDateTime getDebut(){
        return debut;
    }

    public LocalDateTime getFin(){
        return fin;
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getDebutHeure(){
        return outputFormatter.format(debut);
    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    public String getFinHeure(){
        return outputFormatter.format(fin);
    }

    void AfficherCours(){
        Log.i("Cours","----------------------------------------------");
        Log.i("Cours",title);
        Log.i("Cours",description);
        Log.i("Cours",salle);
        Log.i("Cours",start);
        Log.i("Cours",end);
        Log.i("Cours",class_name);
        Log.i("Cours","----------------------------------------------");
    }

    public boolean isCoursAnnule(){
        return (salle.matches("ANNULE"));
    }

    public int isCoursAnnuleStr(){

        if (salle.matches("ANNULE")){
            return 1;
        }
        return 0;
    }

}
