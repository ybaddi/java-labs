package com.cnss.main;

import java.util.Arrays;

public class ExerciceTableau {

    public static void main(String[] args) {
        String[] adresses = new String[10];
        adresses[0] = "b.y@cnss.ma";
        adresses[1] = "b.y@cnss.ma";
        adresses[2] = "b.y@cnss.ma";
        adresses[3] = "b.y@cnss.ma";
        adresses[4] = "b.y@cnss.ma";
        adresses[5] = "b.y@cnops.ma";
        adresses[6] = "b.y@cnss.ma";
        adresses[7] = "b.y@cnss.ma";
        adresses[8] = "b.y@cnops.ma";
        adresses[9] = "b.y@cnops.ma";

        String[] fournisseurs = new String[10];
        for(int i=0; i<adresses.length; i++){
            fournisseurs[i] = adresses[i].substring(adresses[i].indexOf('@')+1);
        }

        // display a list of fournisseur
        System.out.println(Arrays.toString(adresses));
        System.out.println(Arrays.toString(fournisseurs));
        Arrays.sort(fournisseurs);
        System.out.println(Arrays.toString(fournisseurs));

        // initialisation
        String[] fournisseursOccurence = new String[10];

        fournisseursOccurence[0] = fournisseurs[0];
        // copy from fournisseur
       for(int i=0; i<fournisseursOccurence.length; i++){
             if(!fournisseursOccurence[i].equals(fournisseurs[i]));
             fournisseursOccurence=Arrays.copyOf(fournisseurs[fournisseurs.length+1]);
        }
    }
}
