package com.rahetbelek.models;

public class Paiement {

    private int id;
    private double montant;
    private String date;
    private String statut;
    private String methodePaiement;

    public Paiement() {
    }

    public Paiement(int id, double montant, String date,
                    String statut, String methodePaiement) {
        this.id = id;
        this.montant = montant;
        this.date = date;
        this.statut = statut;
        this.methodePaiement = methodePaiement;
    }

    public void effectuerPaiement() {
        System.out.println("Paiement de " + montant + " DT effectue ");
        this.statut = "Confirme";
    }

    public void annulerPaiement() {
        System.out.println("Paiement annule ");
        this.statut = "Annule";
    }

    public void afficherHistorique() {
        System.out.println("--- Historique Paiement ---");
        System.out.println("ID: " + id);
        System.out.println("Montant: " + montant + " DT");
        System.out.println("Date: " + date);
        System.out.println("Statut: " + statut);
        System.out.println("Methode: " + methodePaiement);
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