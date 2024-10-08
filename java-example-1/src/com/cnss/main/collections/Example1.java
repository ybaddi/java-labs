package com.cnss.main.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class Example1 {

    public static void main(String[] args) {
        ArrayList numbers = new ArrayList();

        Scanner sc = new Scanner(System.in);

        int number;
        System.out.println("Veuillez entrer les numbers");
        while(true){
            number = sc.nextInt();
            if(number == 0){
                break;
            }else if(number > 0){
                numbers.add(number);
            }
        }

        for(int i=0;i<numbers.size(); i++){
            System.out.println(numbers.get(i));
        }

//        numbers.remove
    }

}
