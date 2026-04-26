package com.rahetbelek.models;

import java.util.ArrayList;
import java.util.List;

public class Prestataire {

    private String id;
    private String nom;
    private String prenom;
    private String email;
    private String telephone;
    private String service;          // ex: "aide médicale", "courses", etc.
    private boolean disponible;
    private boolean profilValide;
    private ProfilPrestataire profil;
    private List<Disponibilite> disponibilites;

    public Prestataire(String id, String nom, String prenom, String email, String telephone, String service) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.telephone = telephone;
        this.service = service;
        this.disponible = false;
        this.profilValide = false;
        this.disponibilites = new ArrayList<>();
    }

    // --- Inscription ---
    public void inscrire() {
        System.out.println("📝 Prestataire " + nom + " " + prenom + " inscrit avec succès.");
        System.out.println("   ⏳ Profil en attente de validation.");
    }

    // --- Validation profil ---
    public void validerProfil() {
        if (this.profil != null) {
            this.profilValide = true;
            this.disponible = true;
            System.out.println("✅ Profil de " + nom + " validé. Il peut maintenant recevoir des missions.");
        } else {
            System.out.println("❌ Impossible de valider : aucun profil associé.");
        }
    }

    // --- Disponibilité ---
    public void ajouterDisponibilite(Disponibilite d) {
        this.disponibilites.add(d);
        System.out.println("📅 Disponibilité ajoutée : " + d);
    }

    public boolean isDisponiblePour(String jour, String heure) {
        for (Disponibilite d : disponibilites) {
            if (d.getJour().equalsIgnoreCase(jour) && d.couvre(heure)) {
                return true;
            }
        }
        return false;
    }

    // --- Consultation missions disponibles ---
    public void consulterMissionsDisponibles(List<Demande> demandes) {
        System.out.println("🔍 Missions disponibles pour " + nom + " (" + service + ") :");
        boolean found = false;
        for (Demande d : demandes) {
            if (d.getStatut().equals("en_attente") && d.getTypeService().equalsIgnoreCase(this.service)) {
                System.out.println("   → Mission #" + d.getId() + " : " + d.getDescription());
                found = true;
            }
        }
        if (!found) System.out.println("   Aucune mission disponible pour le moment.");
    }

    // --- Accepter une mission ---
    public void accepterMission(Demande demande) {
        if (!profilValide) {
            System.out.println("❌ Profil non validé. Impossible d'accepter une mission.");
            return;
        }
        if (!disponible) {
            System.out.println("❌ " + nom + " n'est pas disponible.");
            return;
        }
        System.out.println("✅ " + nom + " a accepté la mission: " + demande.getTypeService());
        demande.setStatut("mission_en_cours");
        this.disponible = false;
    }

    // --- Getters & Setters ---
    public String getId() { return id; }
    public String getNom() { return nom; }
    public String getPrenom() { return prenom; }
    public String getEmail() { return email; }
    public String getTelephone() { return telephone; }
    public String getService() { return service; }
    public boolean isDisponible() { return disponible; }
    public boolean isProfilValide() { return profilValide; }
    public ProfilPrestataire getProfil() { return profil; }
    public void setProfil(ProfilPrestataire profil) { this.profil = profil; }
    public void setDisponible(boolean disponible) { this.disponible = disponible; }
    public List<Disponibilite> getDisponibilites() { return disponibilites; }

    @Override
    public String toString() {
        return "[Prestataire] " + nom + " " + prenom + " | Service: " + service +
               " | Validé: " + profilValide + " | Disponible: " + disponible;
    }
}