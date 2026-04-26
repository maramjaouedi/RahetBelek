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
    
    // Nouvelle méthode avec vraie logique
    public void publier() {
        // Vérifications
        if (budget <= 0) {
            System.out.println("❌ Erreur: Le budget doit etre superieur a 0 DT");
            return;
        }
        if (description == null || description.length() < 10) {
            System.out.println("❌ Erreur: La description doit contenir au moins 10 caracteres");
            return;
        }
        if (typeService == null || typeService.isEmpty()) {
            System.out.println("❌ Erreur: Le type de service est obligatoire");
            return;
        }
        
        this.statut = "en_attente";
        System.out.println("✅ Demande #" + id + " publiee avec succes!");
        System.out.println("   Type: " + typeService);
        System.out.println("   Budget: " + budget + " DT");
        System.out.println("   Statut: " + statut);
    }
    
    // Nouvelle méthode: recevoir une proposition de prestataire
    public void recevoirProposition(Prestataire prestataire, String message) {
        if (prestataire == null) {
            System.out.println("❌ Erreur: Prestataire invalide");
            return;
        }
        
        String proposition = "Proposition de " + prestataire.getNom() + ": " + message;
        propositions.add(proposition);
        System.out.println("📩 Nouvelle proposition recue pour la demande #" + id);
        System.out.println("   " + proposition);
    }
    
    // Nouvelle méthode: choisir un prestataire
    public boolean choisirPrestataire(Prestataire prestataire) {
        if (prestataire == null) {
            System.out.println("❌ Erreur: Prestataire invalide");
            return false;
        }
        
        if (!statut.equals("en_attente")) {
            System.out.println("❌ Erreur: Cette demande n'est plus disponible");
            return false;
        }
        
        this.prestataireChoisi = prestataire;
        this.statut = "mission_en_cours";
        System.out.println("✅ Prestataire choisi: " + prestataire.getNom());
        System.out.println("   Statut mis a jour: " + statut);
        return true;
    }
    
    public void afficherDetails() {
        System.out.println("┌─────────────────────────────────┐");
        System.out.println("│ Demande #" + id);
        System.out.println("│ Type: " + typeService);
        System.out.println("│ Description: " + (description.length() > 50 ? description.substring(0, 50) + "..." : description));
        System.out.println("│ Localisation: " + localisation);
        System.out.println("│ Budget: " + budget + " DT");
        System.out.println("│ Statut: " + statut);
        System.out.println("│ Date: " + dateCreation);
        if (prestataireChoisi != null) {
            System.out.println("│ Prestataire: " + prestataireChoisi.getNom());
        }
        System.out.println("└─────────────────────────────────┘");
    }
    
    public void afficherPropositions() {
        System.out.println("\n📋 Propositions pour la demande #" + id + ":");
        if (propositions.isEmpty()) {
            System.out.println("   Aucune proposition pour le moment");
        } else {
            for (String p : propositions) {
                System.out.println("   • " + p);
            }
        }
    }
    
    public void terminer() {
        if (!statut.equals("mission_en_cours")) {
            System.out.println("❌ Erreur: Seule une mission en cours peut etre terminee");
            return;
        }
        this.statut = "terminee";
        System.out.println("✅ Mission #" + id + " terminee avec succes!");
    }
    
    // Getters
    public int getId() { return id; }
    public String getTypeService() { return typeService; }
    public String getStatut() { return statut; }
    public double getBudget() { return budget; }
    public Expatrie getClient() { return client; }
    public Prestataire getPrestataireChoisi() { return prestataireChoisi; }
    public List<String> getPropositions() { return propositions; }

        public void setStatut(String statut) {
        this.statut = statut;
    }
}