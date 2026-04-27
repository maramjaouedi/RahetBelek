package com.rahetbelek.models;

import java.util.ArrayList;
import java.util.List;

public class PaiementV2 {

    private int id;
    private double montant;
    private String date;
    private String statut;
    private String methodePaiement;
    private List<PaiementV2> historique;

    public PaiementV2() {
        this.historique = new ArrayList<>();
    }

    public PaiementV2(int id, double montant, String date,
                    String statut, String methodePaiement) {
        this.id = id;
        this.montant = montant;
        this.date = date;
        this.statut = statut;
        this.methodePaiement = methodePaiement;
        this.historique = new ArrayList<>();
    }

    public boolean effectuerPaiement(double soldeDisponible) {
        if (montant <= 0) {
            System.out.println("Erreur : montant invalide (" + montant + " DT)");
            this.statut = "Echoue";
            return false;
        }
        if (soldeDisponible < montant) {
            System.out.println("Erreur : solde insuffisant (solde: "
                    + soldeDisponible + " DT, montant: " + montant + " DT)");
            this.statut = "Echoue";
            return false;
        }
        this.statut = "Confirme";
        double nouveauSolde = soldeDisponible - montant;
        System.out.println("Paiement de " + montant + " DT confirme!");
        System.out.println("Methode: " + methodePaiement);
        System.out.println("Solde restant: " + nouveauSolde + " DT");
        historique.add(this);
        return true;
    }

    public void annulerPaiement() {
        if (this.statut.equals("Confirme")) {
            this.statut = "Annule";
            System.out.println("Paiement #" + id + " annule avec succes.");
        } else {
            System.out.println("Impossible d'annuler : statut = " + statut);
        }
    }

    public void afficherHistorique() {
        System.out.println("\n=== Historique des Paiements ===");
        if (historique.isEmpty()) {
            System.out.println("Aucun paiement enregistre.");
            return;
        }
        double total = 0;
        for (PaiementV2 p : historique) {
            System.out.println("ID      : " + p.id);
            System.out.println("Montant : " + p.montant + " DT");
            System.out.println("Date    : " + p.date);
            System.out.println("Statut  : " + p.statut);
            System.out.println("Methode : " + p.methodePaiement);
            System.out.println("---");
            if (p.statut.equals("Confirme")) total += p.montant;
        }
        System.out.println("Total confirme : " + total + " DT");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public double getMontant() { return montant; }
    public void setMontant(double montant) { this.montant = montant; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public String getMethodePaiement() { return methodePaiement; }
    public void setMethodePaiement(String m) { this.methodePaiement = m; }
}
