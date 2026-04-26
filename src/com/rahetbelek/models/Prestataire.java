package com.rahetbelek.models;

public class Prestataire {
    private String nom;
    private String service;
    private boolean disponible;
    
    public Prestataire(String nom, String service) {
        this.nom = nom;
        this.service = service;
        this.disponible = true;
    }
    
    public String getNom() { return nom; }
    public String getService() { return service; }
    public boolean isDisponible() { return disponible; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    
    public void accepterMission(Demande demande) {
        System.out.println("✅ " + nom + " a accepte la mission: " + demande.getTypeService());
        demande.setStatut("mission_en_cours");
    }
}