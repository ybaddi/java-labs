package com.cnss.main.tp3.exercice2;

import java.time.Duration;

public class DVD extends Article{

    private Duration duree;
    private String realisateur;

    public DVD(Duration duree, String realisateur) {
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public DVD(String reference, Duration duree, String realisateur) {
        super(reference);
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public DVD(String reference, String designation, Duration duree, String realisateur) {
        super(reference, designation);
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public DVD(String reference, String designation, double prix, Duration duree, String realisateur) {
        super(reference, designation, prix);
        this.duree = duree;
        this.realisateur = realisateur;
    }

    public Duration getDuree() {
        return duree;
    }

    public void setDuree(Duration duree) {
        this.duree = duree;
    }

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "duree=" + duree +
                ", realisateur='" + realisateur + '\'' +
                '}';
    }
}
