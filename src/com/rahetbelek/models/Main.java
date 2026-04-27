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
        
        System.out.println("\n Sprint 2 - Logique metier ajoutee");
    }
    // --- Paiement sécurisé + Historique (Sara) ---
        System.out.println("\n--- Paiement sécurisé (Sara) ---");
        Paiement paiement = new Paiement(1, 149.0, "2026-04-26", "En attente", "Carte bancaire");
        paiement.effectuerPaiement();
        paiement.afficherHistorique();

        Paiement paiement2 = new Paiement(2, 89.0, "2026-04-15", "En attente", "Virement");
        paiement2.effectuerPaiement();
        paiement2.afficherHistorique();
}
// --- Sprint 2 : PaiementV2 - Logique metier (Sara) ---
        System.out.println("\n=== Sprint 2 - Paiement securise (Sara) ===");

        // Scenario 1 : paiement reussi
        PaiementV2 p1 = new PaiementV2(1, 149.0, "2026-04-27", "En attente", "Carte bancaire");
        p1.effectuerPaiement(500.0);

        // Scenario 2 : solde insuffisant
        PaiementV2 p2 = new PaiementV2(2, 89.0, "2026-04-27", "En attente", "Virement");
        p2.effectuerPaiement(50.0);

        // Scenario 3 : annulation
        PaiementV2 p3 = new PaiementV2(3, 199.0, "2026-04-27", "En attente", "Carte bancaire");
        p3.effectuerPaiement(300.0);
        p3.annulerPaiement();

        // Afficher historique
        p1.afficherHistorique();
        }
}
