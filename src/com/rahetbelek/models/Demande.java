package com.rahetbelek.models;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

public class Demande {
    private int id;
    private String typeService;
    private String description;
    private String localisation;
    private double budget;
    private String statut;
    private Date dateCreation;
    private Expatrie client;
    private Prestataire prestataireChoisi;
    private List<String> propositions;

    public Demande() {
        this.propositions = new ArrayList<>();
    }
    
    public Demande(int id, String typeService, String description, 
                   String localisation, double budget, Expatrie client) {
        this.id = id;
        this.typeService = typeService;
        this.description = description;
        this.localisation = localisation;
        this.budget = budget;
        this.client = client;
        this.statut = "en_attente";
        this.dateCreation = new Date();
        this.propositions = new ArrayList<>();
    }

    public void publier() {
        if (budget <= 0) {
            System.out.println("❌ Budget invalide");
            return;
        }
        this.statut = "en_attente";
        System.out.println("✅ Demande publiée !");
    }

    public void recevoirProposition(Prestataire prestataire, String message) {
        String proposition = prestataire.getNom() + ": " + message;
        propositions.add(proposition);
    }

    public boolean choisirPrestataire(Prestataire prestataire) {
        if (!statut.equals("en_attente")) return false;
        this.prestataireChoisi = prestataire;
        this.statut = "mission_en_cours";
        return true;
    }

    public void terminer() {
        this.statut = "terminee";
    }

    // 🔥 من version متاعك (important)
    public void afficherDemande() {
        System.out.println("Demande: " + description + " | Statut: " + statut);
    }

    // Getters
    public int getId() { return id; }
    public String getStatut() { return statut; }

    public void setStatut(String statut) {
        this.statut = statut;
    }
}