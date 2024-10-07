package com.cnss.main;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int compt=0;
        while(compt <=10){
            if(compt %2==0){
                System.out.println(compt);
            }
            compt++;
        }
        System.out.println("===================");
        for(int i=0; i<=10;i++){
            if(i %2==0){
                System.out.println(i);
            }
        }

        System.out.println("===================");
        for(int i=0; i<=10;i=i+2){
            System.out.println(i);
        }

        System.out.println("===================");
        Random random = new Random();
        int nombre1, nombre2;

        do {
            nombre1 = random.nextInt(34);
            nombre2 = nombre1 * 3;
        } while (nombre2 > 100);

        System.out.println("Nombre 1 : " + nombre1);
        System.out.println("Nombre 2 (le triple) : " + nombre2);

        System.out.println("===================");
//        Scanner sc = new Scanner(System.in);
//
//        int number1 = sc.nextInt();
//        int number2 = sc.nextInt();
//        if(number1 == 2*number2){
//            System.out.println("number 2 is double of number1)");
//        }else if(number2 == 2*number1){
//            System.out.println("number 1 is double of number2)");
//        }else{
//            System.out.println("no one is double of other one");
//        }

        System.out.println("===================");
        String filename = "./src/numbers.csv";
        int res=0;

        try(BufferedReader bf = new BufferedReader(new FileReader(filename))){

            String str;
            while((str=bf.readLine())!=null){
                int val =Integer.parseInt(str);
                res+=val;
            }

        }catch(IOException ex){
            System.out.println("error : " + ex.getMessage());
        }
        System.out.println(res);

        delimiter();
        Address ad1=new Address("qods",1294,"casa");
        Address ad2=new Address("boustane",1294,"el jadida");
        Personne p =new Personne(1,"ahmed", "adil", ad1);
        System.out.println(p);

        delimiter();

        Personne[] ps = new Personne[4];
        Personne p1 =new Ensignient(1,"ahmed", "adil", ad1, 15500);
        Personne p2 =new Ensignient(1,"ahmed", "adil", ad1, 15500);
        Personne p3 =new Etudiant(1,"ahmed", "adil", ad1, 1);
        Personne p4 =new Etudiant(1,"ahmed", "adil", ad1, 1);
        ps[0]=p1;
        ps[1]=p2;
        ps[2]=p3;
        ps[3]=p4;
        for(Personne es : ps){
            if(es instanceof Ensignient){
                System.out.println(((Ensignient) es).getSalaire());
            }else{
                System.out.println(((Etudiant) es).getLevel());
            }
            // autre method
            System.out.println(es.getClass().getSimpleName());
          if(es.getClass().getSimpleName() == "Ensignient"){
                System.out.println(((Ensignient) es).getSalaire());
            }else if(es.getClass().getSimpleName() == "Etudiant"){
                System.out.println(((Etudiant) es).getLevel());
            }
        }



    }

    private static void delimiter() {
        System.out.println("===================");
    }

}
