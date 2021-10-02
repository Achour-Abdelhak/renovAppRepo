package com.renovSolution.renov.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

import static javax.persistence.GenerationType.SEQUENCE;

@Entity(name="OffreDeService")
@Table(name="offre_de_service")
public class OffreDeService implements Serializable {
    @Id
    @SequenceGenerator(
            name="offreDeService_sequence",
            sequenceName = "offreDeService_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = SEQUENCE,
            generator = "offreDeService_sequence"
    )

    @Column(
            name="offreDeService_id",
            nullable = false,
            updatable = false
    )
    private Long idOds ;

    @Column(
            name="montant",
            nullable = false,
            columnDefinition = "double"
    )
    private LocalDate montant;

    @Column(
            name="date_offre",
            nullable = false,
            columnDefinition = "DATE"
    )
    private LocalDate dateOffre;

    @Column(
            name="date_valide",
            nullable = false,
            columnDefinition = "DATE"
    )
    private LocalDate dateValide;

    @Column(
            name="statut",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String statut ;

    @JoinColumn(
            name="utilisateur_id",

            referencedColumnName = "utilisateur_id",
            foreignKey = @ForeignKey(
                    name="offre_de_service_contracteur_fk"
            )

    )
    @JsonBackReference
    private Contracteur contracteur;

    public OffreDeService() {
    }

    public OffreDeService(Long idOds, LocalDate montant, LocalDate dateOffre, LocalDate dateValide, String statut) {
        this.idOds = idOds;
        this.montant = montant;
        this.dateOffre = dateOffre;
        this.dateValide = dateValide;
        this.statut = statut;
    }

    public Long getIdOds() {
        return idOds;
    }

    public void setIdOds(Long idOds) {
        this.idOds = idOds;
    }

    public LocalDate getMontant() {
        return montant;
    }

    public void setMontant(LocalDate montant) {
        this.montant = montant;
    }

    public LocalDate getDateOffre() {
        return dateOffre;
    }

    public void setDateOffre(LocalDate dateOffre) {
        this.dateOffre = dateOffre;
    }

    public LocalDate getDateValide() {
        return dateValide;
    }

    public void setDateValide(LocalDate dateValide) {
        this.dateValide = dateValide;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    @Override
    public String toString() {
        return "OffreDeService{" +
                "idOds=" + idOds +
                ", montant=" + montant +
                ", dateOffre=" + dateOffre +
                ", dateValide=" + dateValide +
                ", statut='" + statut + '\'' +
                '}';
    }
}
