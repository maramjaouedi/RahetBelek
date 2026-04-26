package com.rahetbelek.models;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RAHET BELEK - SPRINT 1 ===\n");
        
        Expatrie maram = new Expatrie("Maram");
        Demande demande = new Demande("Aide à domicile", 150);
        
        maram.publierDemande(demande);
        maram.afficherMesDemandes();
        
        System.out.println("\n✅ Sprint 1 - OK");
    }
}