package com.rahetbelek.models;

public class Admin {

    private String nom;
    private String email;

    public Admin(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }

    public void afficherDashboard() {
        System.out.println("Bienvenue Admin: " + nom);
    }

    public void validerDemande(Demande d) {
        System.out.println("Admin valide la demande...");
        d.accepter();
    }
}