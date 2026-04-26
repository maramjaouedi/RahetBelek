package com.rahetbelek.models;

import java.util.ArrayList;
import java.util.List;

public class Expatrie {
    private String nom;
    private List<Demande> mesDemandes;
    
    public Expatrie(String nom) {
        this.nom = nom;
        this.mesDemandes = new ArrayList<>();
    }
    
    public void publierDemande(Demande demande) {
        mesDemandes.add(demande);
        demande.publier();
        System.out.println("✓ Publié par " + this.nom);
    }
    
    public void afficherMesDemandes() {
        System.out.println("\n--- Demandes de " + this.nom + " ---");
        for (Demande d : mesDemandes) {
            d.afficherDetails();
        }
    }
    
    public String getNom() { return nom; }
}