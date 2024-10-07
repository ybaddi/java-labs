package com.cnss.main;

public abstract class Personne {
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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public abstract String fullName();
}
