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

    }

}
