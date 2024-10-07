package com.cnss.main;

public class Personne {
    private int num;
    private String nom;
    private String prenom;
            private Address address;

    public Personne(int num, String nom, String prenom, Address address) {
        this.num = num;
        this.nom = nom;
        this.prenom = prenom;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Personne{" +
                "num=" + num +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", address=" + address +
                '}';
    }
}
