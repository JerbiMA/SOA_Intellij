package entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
public class Compte {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identifiant unique du compte

    private double solde; // Solde du compte

    private Date dateCreation; // Date de création du compte

    @Enumerated(EnumType.STRING)
    private etatCompte etat; // État du compte, utilise l'énumération etatCompte

    @Enumerated(EnumType.STRING)
    private typeCompte type; // Type de compte, utilise l'énumération typeCompte

    public void setSolde(double solde) {
        this.solde=solde;
    }

    public void setDateCreation(Date date) {
        this.dateCreation=date;
    }

    public void setType(typeCompte typeCompte) {
        this.type=typeCompte;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public etatCompte getEtat() {
        return etat;
    }

    public typeCompte getType() {
        return type;
    }

    public double getSolde() {
        return solde;
    }

    public void setEtat(etatCompte etatCompte) {
        this.etat=etatCompte;
    }

    public Long getId() {
        return id;
    }

    // Enumération pour les différents types de compte possibles
    public enum typeCompte {
        COURANT, // Compte courant
        EPARGNE // Compte épargne
    }

    // Enumération pour les différents états du compte possibles
    public enum etatCompte {
        CREE, // Compte créé
        ACTIVE, // Compte actif
        SUSPENDU, // Compte suspendu
        BLOQUE // Compte bloqué
    }

    public void setId(Long id) {
        this.id = id;
    }
}