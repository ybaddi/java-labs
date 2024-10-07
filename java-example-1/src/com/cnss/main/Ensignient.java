package com.cnss.main;

public class Ensignient extends Personne{
    private int salaire;

    public Ensignient(int num, String nom, String prenom, Address address, int salaire) {
        super(num, nom, prenom, address);
        this.salaire = salaire;
    }

    public int getSalaire() {
        return salaire;
    }

    public String fullName(){
        return this.getNom() + " " + getPrenom();
    }
}
