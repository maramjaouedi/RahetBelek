 /*public class Main {
    public static void main(String[] args) {

        System.out.println("=== Rahet Belek — Gestion des missions ===");

        Mission m1 = new Mission(1, "Acheter médicaments", "En attente");

        m1.afficherMission();

        m1.accepterMission();

        m1.afficherMission();

        m1.terminerMission();

        m1.afficherMission();
    }
} */
import backend.gestion_missions.Mission;
import backend.gestion_missions.MissionService;

public class Main {
    public static void main(String[] args) {
        // Initialisation du service
        MissionService service = new MissionService();

        // Création des missions (Sprint 2)
        // Vérifie que ton constructeur Mission a bien 4 paramètres
        Mission m1 = new Mission(1, "Achat Médicaments", "Pour un senior", "EN ATTENTE");
        Mission m2 = new Mission(2, "Courses", "Aide à domicile", "A FAIRE");

        // Utilisation du service
        service.ajouterMission(m1);
        service.ajouterMission(m2);

        // Affichage final
        System.out.println("=== Application Rahet Belek - Sprint 2 ===");
        service.afficherMissions();
    }    
// 5. Test des nouvelles fonctionnalités (Image 017eda)
        System.out.println("\n=== Missions disponibles ===");
        service.afficherMissionsDisponibles();

        System.out.println("\n=== Acceptation mission ===");
        // On simule que Razan accepte la mission numéro 2
        service.accepterMission(2, "Razan");

        System.out.println("\n=== Mes missions (Razan) ===");
        service.afficherMesMissions("Razan");
}