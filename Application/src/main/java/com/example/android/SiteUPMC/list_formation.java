package com.example.android.SiteUPMC;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class list_formation {
    public ArrayList<String> listeFormation = new ArrayList<String>();



    public list_formation() throws FileNotFoundException {
        File doc =
                new File("listFormation.txt");
        Scanner obj = new Scanner(doc);

        while (obj.hasNextLine())
            listeFormation.add(obj.nextLine());

    }

}
