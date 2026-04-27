package com.rahetbelek.models;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== RAHET BELEK ===\n");

        // 🔵 Partie 1: Interaction utilisateur
        Scanner sc = new Scanner(System.in);

        System.out.print("Entrez votre nom: ");
        String nom = sc.nextLine();

        Admin admin = new Admin("Admin1", "admin@mail.com");

        System.out.print("Décrivez votre demande: ");
        String desc = sc.nextLine();

        Expatrie user = new Expatrie(nom);
        Demande d = new Demande(1, "Service", desc, "Tunis", 100.0, user);

        System.out.println("\nDemande créée:");
        d.afficherDemande();

        System.out.println("\n1. Valider la demande");
        System.out.print("Choix: ");
        int choix = sc.nextInt();

        if (choix == 1) {
            admin.validerDemande(d);
        }

        System.out.println("Statut final: " + d.getStatut());

        // 🔵 Partie 2: Logique métier
        System.out.println("\n=== Sprint 2 ===");

        Prestataire ali = new Prestataire("Ali", "Aide à domicile");

        d.publier();
        d.recevoirProposition(ali, "Disponible");
        d.choisirPrestataire(ali);

        d.afficherPropositions();
        d.afficherDetails();

        // 🔵 Partie 3: Paiement
        System.out.println("\n--- Paiement sécurisé ---");

        Paiement paiement = new Paiement(1, 149.0, "2026-04-26", "En attente", "Carte bancaire");
        paiement.effectuerPaiement();
        paiement.afficherHistorique();

        Paiement paiement2 = new Paiement(2, 89.0, "2026-04-15", "En attente", "Virement");
        paiement2.effectuerPaiement();
        paiement2.afficherHistorique();
    }
}