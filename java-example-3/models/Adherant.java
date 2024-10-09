package models;

import java.util.Date;

public class Adherant {
    private int id;
   private String  nom;
    private String prenom;
    private Date dateNaissence;

    public Adherant(int id, String nom, String prenom, Date dateNaissence) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNaissence = dateNaissence;
    }

    @Override
    public String toString() {
        return "Adherant{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", dateNaissence=" + dateNaissence +
                '}';
    }
}
