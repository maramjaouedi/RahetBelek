package com.rahetbelek.models;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Rahet Belek ===");

        System.out.print("Entrez votre nom: ");
        String nom = sc.nextLine();

        Admin admin = new Admin("Admin1", "admin@mail.com");

        System.out.print("Décrivez votre demande: ");
        String desc = sc.nextLine();

        Demande d = new Demande(desc);

        System.out.println("Demande créée:");
        d.afficherDemande();

        System.out.println("\n1. Valider la demande");
        System.out.print("Choix: ");
        int choix = sc.nextInt();

        if (choix == 1) {
            admin.validerDemande(d);
        }

        System.out.println("Statut final: " + d.getStatut());
    }
}