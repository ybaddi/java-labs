package com.cnss.main;

public class Address {
    private String rue;
    private int codePostal;
    private String ville;

    public Address(String rue, int codePostal, String ville) {
        this.rue = rue;
        this.codePostal = codePostal;
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Address{" +
                "rue='" + rue + '\'' +
                ", codePostal=" + codePostal +
                ", ville='" + ville + '\'' +
                '}';
    }
}
