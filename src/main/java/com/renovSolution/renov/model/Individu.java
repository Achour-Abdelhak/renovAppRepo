package com.renovSolution.renov.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Individu")
@Table(name="individu")
public class Individu extends  Contracteur implements Serializable{
    @Column(
            name="certificat",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String certificat ;

    @Column(
            name="nom",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String nom ;

    @Column(
            name="prenom",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String prenom ;

    public Individu() {
    }

    public Individu(String certificat, String nom, String prenom) {
        this.certificat = certificat;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Individu(int note, int anneeExperience, String secteurActivite, String courriel, String telephone, String certificat, String nom, String prenom) {
        super(note, anneeExperience, secteurActivite, courriel, telephone);
        this.certificat = certificat;
        this.nom = nom;
        this.prenom = prenom;
    }

    public Individu(String username, String password, LocalDate dateInscription, String type, int note, int anneeExperience, String secteurActivite, String courriel, String telephone, String certificat, String nom, String prenom) {
        super(username, password, dateInscription, type, note, anneeExperience, secteurActivite, courriel, telephone);
        this.certificat = certificat;
        this.nom = nom;
        this.prenom = prenom;
    }

    public String getCertificat() {
        return certificat;
    }

    public void setCertificat(String certificat) {
        this.certificat = certificat;
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

    @Override
    public String toString() {
        return "Individu{" +
                "certificat='" + certificat + '\'' +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateInscription=" + dateInscription +
                ", type='" + type + '\'' +
                ", adressesUtilisateurs=" + adressesUtilisateurs +
                '}';
    }

}
