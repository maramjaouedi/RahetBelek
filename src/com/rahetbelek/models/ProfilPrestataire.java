package com.rahetbelek.models;

public class ProfilPrestataire {

    private String prestataireId;
    private String cin;             // Carte d'identité nationale
    private String adresse;
    private String experience;      // ex: "3 ans d'aide à domicile"
    private String typeService;     // ex: "accompagnement médical"
    private String statut;          // "en_attente", "valide", "rejete"
    private String photoUrl;

    public ProfilPrestataire(String prestataireId, String cin, String adresse,
                              String experience, String typeService) {
        this.prestataireId = prestataireId;
        this.cin = cin;
        this.adresse = adresse;
        this.experience = experience;
        this.typeService = typeService;
        this.statut = "en_attente";
    }

    public void soumettre() {
        System.out.println("📤 Profil soumis pour validation (CIN: " + cin + ")");
        this.statut = "en_attente";
    }

    public void valider() {
        this.statut = "valide";
        System.out.println("✅ Profil validé.");
    }

    public void rejeter(String raison) {
        this.statut = "rejete";
        System.out.println("❌ Profil rejeté. Raison: " + raison);
    }

    // Getters & Setters
    public String getPrestataireId() { return prestataireId; }
    public String getCin() { return cin; }
    public String getAdresse() { return adresse; }
    public String getExperience() { return experience; }
    public String getTypeService() { return typeService; }
    public String getStatut() { return statut; }
    public String getPhotoUrl() { return photoUrl; }
    public void setPhotoUrl(String photoUrl) { this.photoUrl = photoUrl; }
    public void setStatut(String statut) { this.statut = statut; }

    @Override
    public String toString() {
        return "[Profil] CIN: " + cin + " | Service: " + typeService +
               " | Exp: " + experience + " | Statut: " + statut;
    }
}