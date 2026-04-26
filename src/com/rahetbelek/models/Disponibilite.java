package com.rahetbelek.models;

public class Disponibilite {

    private String prestataireId;
    private String jour;        // ex: "Lundi", "Mardi"
    private String heureDebut;  // ex: "08:00"
    private String heureFin;    // ex: "18:00"

    public Disponibilite(String prestataireId, String jour, String heureDebut, String heureFin) {
        this.prestataireId = prestataireId;
        this.jour = jour;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    /**
     * Vérifie si une heure donnée (format "HH:mm") est dans le créneau.
     */
    public boolean couvre(String heure) {
        return heure.compareTo(heureDebut) >= 0 && heure.compareTo(heureFin) <= 0;
    }

    // Getters
    public String getPrestataireId() { return prestataireId; }
    public String getJour() { return jour; }
    public String getHeureDebut() { return heureDebut; }
    public String getHeureFin() { return heureFin; }

    @Override
    public String toString() {
        return jour + " de " + heureDebut + " à " + heureFin;
    }
}