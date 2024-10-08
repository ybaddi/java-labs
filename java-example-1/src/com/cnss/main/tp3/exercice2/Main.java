package com.cnss.main.tp3.exercice2;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        Livre a1;
        DVD a2;

        a1=new Livre();
        a1.setReference("1200-2300");
        a1.setDesignation("medecin");
        a1.setPrix(300.00);

        System.out.println(a1);
        a2=new DVD("1200-2300","medecin", 300.00 , Duration.ofHours(72), "jebrane");
        System.out.println(a2);
    }
}
