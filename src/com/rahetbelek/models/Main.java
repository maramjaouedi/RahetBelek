package com.rahetbelek.models;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RAHET BELEK - SPRINT 2 ===\n");
        
        // Création des objets
        Expatrie maram = new Expatrie("Maram");
        Prestataire ali = new Prestataire("Ali", "Aide à domicile");
        
        // Création d'une demande (utilise le bon constructeur)
        Demande demande = new Demande(1, "Aide à domicile", 
            "Besoin d'aide pour ma mere de 75 ans",
            "Tunis, Menzah 6", 150.0, maram);
        
        // Publier la demande
        demande.publier();
        
        // Recevoir une proposition
        demande.recevoirProposition(ali, "Je suis disponible pour cette mission");
        
        // Choisir un prestataire
        demande.choisirPrestataire(ali);
        
        // Afficher les propositions
        demande.afficherPropositions();
        
        // Afficher les détails
        demande.afficherDetails();
        
        System.out.println("\n✅ Sprint 2 - Logique metier ajoutee");
    }
}