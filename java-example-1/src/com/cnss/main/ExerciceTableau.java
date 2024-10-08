package com.cnss.main;

import java.util.Arrays;

public class ExerciceTableau {
    static String[] adresses;
    static String[] listeBruteFournisseurs;
    static String[] listeFournisseursDistincts;
    static int[] nombreClients;

    public static void main(String[] args) {
            //INITIALISATION DU TABLEAU
            adresses=new String[10];
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

            listeBruteFournisseurs =new String[10];
            for (int i=0;i<adresses.length;i++)
            {
                listeBruteFournisseurs[i]=adresses[i].substring(adresses[i].indexOf('@')+1);
            }
            System.out.println("Liste brute des fournisseurs:");
            System.out.println(Arrays.toString(listeBruteFournisseurs));

            Arrays.sort(listeBruteFournisseurs);
            System.out.println("Liste triée des fournisseurs:");
            System.out.println(Arrays.toString(listeBruteFournisseurs));

            listeFournisseursDistincts = new String[1];
            nombreClients = new int[1];

            listeFournisseursDistincts[0]=listeBruteFournisseurs[0];
            nombreClients[0]=1;

            for(int i=1;i<listeBruteFournisseurs.length;i++)
            {

        if(!listeBruteFournisseurs[i].equals(listeFournisseursDistincts[listeFournisseursDistincts.length-1]))
        {


       listeFournisseursDistincts = Arrays.copyOf(listeFournisseursDistincts, listeFournisseursDistincts.length+1);
       nombreClients = Arrays.copyOf(nombreClients, nombreClients.length+1);

       listeFournisseursDistincts[listeFournisseursDistincts.length-1]=listeBruteFournisseurs[i];
       nombreClients[nombreClients.length-1]=1;
       }
       else
       {
        nombreClients[nombreClients.length-1]+=1;
       }
            }
            System.out.println("Liste des fournisseurs distincts:");
            System.out.println(Arrays.toString(listeFournisseursDistincts));
            System.out.println("Nombre de clients pour chaque fournisseurs");
            System.out.println(Arrays.toString(nombreClients));

            System.out.println("Parts de marché:");
            for(int i=0;i<listeFournisseursDistincts.length;i++)
            {
        System.out.println(String.format("=> %s \t: %d clients sur %d (%.1f%%)"
                   , listeFournisseursDistincts[i]
                   , nombreClients[i]
                    , adresses.length,
                    (nombreClients[i]*100.0/adresses.length)));
            }

        }
    }
