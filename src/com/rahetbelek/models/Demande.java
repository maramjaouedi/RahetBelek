package com.rahetbelek.models;

public class Demande {
    private String type;
    private double budget;
    
    public Demande(String type, double budget) {
        this.type = type;
        this.budget = budget;
    }
    
    public void publier() {
        System.out.println("📋 Demande: " + type + " - " + budget + " DT");
    }
    
    public void afficherDetails() {
        System.out.println("   " + type + " | " + budget + " DT");
    }
}