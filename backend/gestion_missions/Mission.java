package backend.gestion_missions;

public class Mission {
    private int id;
    private String titre;
    private String description;
    private String statut;
    private String userAssigne;
    public Mission(int id, String titre, String description, String statut) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.statut = statut;
        this.userAssigne = userAssigne;
    }

    // getters et setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTitre() { return titre; }
    public void setTitre(String titre) { this.titre = titre; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getStatut() { return statut; }
    public void setStatut(String statut) { this.statut = statut; }
    public String getUserAssigne() { return userAssigne; }
    public void setUserAssigne(String userAssigne) { this.userAssigne = userAssigne; }
}