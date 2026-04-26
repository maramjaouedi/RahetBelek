package com.rahetbelek.models;

public class Demande {

    private String description;
    private String statut;

    public Demande(String description) {
        this.description = description;
        this.statut = "en attente";
    }

    public void accepter() {
        this.statut = "acceptée";
    }

    public String getStatut() {
        return statut;
    }

    public void afficherDemande() {
        System.out.println("Demande: " + description + " | Statut: " + statut);
    }
}