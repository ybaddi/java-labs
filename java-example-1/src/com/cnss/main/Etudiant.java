package com.cnss.main;

public class Etudiant extends Personne{
    private int level;

    public Etudiant(int num, String nom, String prenom, Address address, int level) {
        super(num, nom, prenom, address);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public String fullName(){
        return this.getNom() + " " + getPrenom();
    }
}