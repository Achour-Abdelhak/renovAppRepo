package com.renovSolution.renov.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.renovSolution.renov.repo.AppelDOffreRepo;
//bonjour
import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity(name="Contracteur")
@Table(name="contracteur")
public class Contracteur extends Utilisateur implements Serializable{
    @Column(
            name="note",
            nullable = false,
            columnDefinition = "integer default 0"
    )
    private int note ;

    @Column(
            name="anneeExperience",
            nullable = false,
            columnDefinition = "integer default 0"
    )
    private int anneeExperience ;

    @Column(
            name="secteurActivite",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String secteurActivite ;

    @Column(
            name="courriel",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String courriel;

    @Column(
            name="telephone",
            nullable = true,
            columnDefinition = "TEXT"
    )
    private String telephone;

    @OneToMany(
            mappedBy = "contracteur",
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST,CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    @JsonManagedReference
    private List<OffreDeService> offreDeService=new ArrayList<>();

    public Contracteur() {
    }

    public Contracteur(int note, int anneeExperience, String secteurActivite, String courriel, String telephone) {
        this.note = note;
        this.anneeExperience = anneeExperience;
        this.secteurActivite = secteurActivite;
        this.courriel = courriel;
        this.telephone = telephone;

    }

    public Contracteur(String username, String password, LocalDate dateInscription, String type, int note, int anneeExperience, String secteurActivite, String courriel, String telephone) {
        super(username, password, dateInscription, type);
        this.note = note;
        this.anneeExperience = anneeExperience;
        this.secteurActivite = secteurActivite;
        this.courriel = courriel;
        this.telephone = telephone;
    }



    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getAnneeExperience() {
        return anneeExperience;
    }

    public void setAnneeExperience(int anneeExperience) {
        this.anneeExperience = anneeExperience;
    }

    public String getSecteurActivite() {
        return secteurActivite;
    }

    public void setSecteurActivite(String secteurActivite) {
        this.secteurActivite = secteurActivite;
    }

    public String getCourriel() {
        return courriel;
    }

    public void setCourriel(String courriel) {
        this.courriel = courriel;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Override
    public String toString() {
        return "Contracteur{" +
                "note=" + note +
                ", anneeExperience=" + anneeExperience +
                ", secteurActivite='" + secteurActivite + '\'' +
                ", courriel='" + courriel + '\'' +
                ", telephone='" + telephone + '\'' +
                ", offreDeService=" + offreDeService +
                ", id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateInscription=" + dateInscription +
                ", type='" + type + '\'' +
                ", adressesUtilisateurs=" + adressesUtilisateurs +
                '}';
    }
}
