package com.cnss.main.tp3.exercice1;

public class Main {
    public static void main(String[] args) {
        Article a1, a2;

        a1=new Article();
        a1.setReference("1200-2300");
        a1.setDesignation("medecin");
        a1.setPrix(300.00);

        System.out.println(a1);
        a2=new Article("1200-2300","medecin", 300.00 );
        System.out.println(a2);
    }
}
