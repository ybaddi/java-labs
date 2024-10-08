package com.cnss.main.tp3.exercice2;

public class Livre extends Article{

    private String ISBN;
    private int nmbr_page;
    private String auteur;

    public Livre() {

    }
    public Livre(String ISBN, int nmb_oage, String auteur) {
        this.ISBN = ISBN;
        this.nmbr_page = nmb_oage;
        this.auteur = auteur;
    }

    public Livre(String reference, String ISBN, int nmb_oage, String auteur) {
        super(reference);
        this.ISBN = ISBN;
        this.nmbr_page = nmb_oage;
        this.auteur = auteur;
    }

    public Livre(String reference, String designation, String ISBN, int nmb_oage, String auteur) {
        super(reference, designation);
        this.ISBN = ISBN;
        this.nmbr_page = nmb_oage;
        this.auteur = auteur;
    }

    public Livre(String reference, String designation, double prix, String ISBN, int nmb_oage, String auteur) {
        super(reference, designation, prix);
        this.ISBN = ISBN;
        this.nmbr_page = nmb_oage;
        this.auteur = auteur;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public int getNmbr_page() {
        return nmbr_page;
    }

    public void setNmbr_page(int nmbr_page) {
        this.nmbr_page = nmbr_page;
    }

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "livre{" +
                "ISBN='" + ISBN + '\'' +
                ", nmbr_page=" + nmbr_page +
                ", auteur='" + auteur + '\'' +
                '}';
    }
}
