# RAHET BELEK - RAPPORT FINAL

## 1. Fiche Projet

**Nom du projet:** Rahet Belek

**Pitch:** Des milliers de Tunisiens vivent à l'étranger. Quand leurs parents âgés ont besoin d'aide, ils se retrouvent seuls. Rahet Belek permet aux familles expatriées d'assurer la sécurité et le confort de leurs parents en Tunisie.

**Problème résolu:** Les expatriés tunisiens ne peuvent pas assurer le suivi quotidien de leurs parents âgés.

**Cible:** Expatriés tunisiens + Prestataires locaux

**Acteurs:**
1. Expatrié (Client)
2. Prestataire
3. Administrateur

**Fonctionnalités:**
| Membre | Fonctionnalité |
|--------|----------------|
| Maram Jaouadi | Gestion des demandes |
| Islem Talmoudhi | Gestion des prestataires |
| Razan Salem | Gestion des missions |
| Hajer Saidi | Dashboard + Paiement |

## 2. Product Backlog

| ID | User Story | Priorité | Points | Membre |
|----|------------|----------|--------|--------|
| US1 | En tant qu'expatrié, je veux publier une demande | Must | 5 | Maram |
| US2 | En tant qu'expatrié, je veux consulter mes demandes | Must | 3 | Maram |
| US3 | En tant que prestataire, je veux créer mon profil | Must | 5 | Islem |
| US4 | En tant que prestataire, je veux gérer ma disponibilité | Should | 3 | Islem |
| US5 | En tant que prestataire, je veux voir les missions | Must | 5 | Razan |
| US6 | En tant que prestataire, je veux suivre mes missions | Must | 3 | Razan |
| US7 | En tant qu'expatrié, je veux payer une mission | Must | 8 | Hajer |
| US8 | En tant qu'expatrié, je veux voir l'historique | Should | 2 | Hajer |
| US9 | En tant qu'admin, je veux voir le tableau de bord | Must | 5 | Hajer |
| US10 | En tant qu'admin, je veux gérer les utilisateurs | Could | 3 | Hajer |


## 3. Modélisation UML

### Diagramme de Cas d'Utilisation
![DCU](captures/dcu.png)

### Diagramme de Classes
![DC](captures/dc.png)

### Diagramme de Séquence
![DS](captures/ds.png)


## 4. Sprint Backlogs

### Sprint 1
- **Goal:** Maquettes Figma + squelette Java exécutable
- **US sélectionnées:** US1, US2
- **Definition of Done:** Code compile, Main.exe, PR créée

### Sprint 2
- **Goal:** Logique métier complète + paiement + dashboard
- **US sélectionnées:** US3 à US9
- **Vélocité prévue:** 37 points
- **Vélocité réalisée:** 31 points


## 5. Code - Approche Hybride AGL + IA

### Exemple: Classe Demande

**Prompt IA utilisé:**
"Crée une classe Java Demande avec champs id, typeService, description, localisation, budget, statut. Ajoute méthode publier() avec validations"

**Code final:**
```java
public void publier() {
    if (budget <= 0) {
        System.out.println("Erreur: budget invalide");
        return;
    }
    this.statut = "en_attente";
    System.out.println("Demande publiée: " + typeService);
}


## 6. Tableau Comparatif AGL vs IA

| Critère | AGL pur (Sprint 1) | IA pure | Hybride (notre approche) |
|---------|-------------------|---------|-------------------------|
| Cohérence structurelle | ✓ Garantie par DC | ✗ Variable | ✓ Vérifiée |
| Rapidité | ✗ Lente | ✓ Rapide | ✓ Rapide |
| Qualité code métier | ✗ Pas de logique | ✗ À vérifier | ✓ Testée |
| Documentation | ✓ Manuelle | ✗ Peu | ✓ Prompts notés |
| Nommage français | ✓ Respecté | ✗ Parfois anglais | ✓ Corrigé |


## 7. Sprint Reviews & Rétrospectives

### Sprint 1 Review
- **US terminées:** US1, US2
- **US incomplètes:** US3-US10 (autres membres absents)
- **PO Satisfaction:** ✅ Maquettes validées, Main.java exécutable

### Sprint 1 Rétrospective
- **Ce qui a bien fonctionné:** Maquettes Figma rapides, code compile
- **Ce qui doit être amélioré:** Islem absent, pas de revue de code
- **Actions:** Toute l'équipe présente pour Sprint 2

### Sprint 2 Review
- **US terminées:** US3 à US9
- **PO Satisfaction:** ✅ Logique métier complète, paiement fonctionnel

### Sprint 2 Rétrospective
- **Ce qui a bien fonctionné:** Toute l'équipe a contribué
- **Ce qui doit être amélioré:** Communication



## 8. Bilan Individuel

**Maram Jaouadi (Product Owner + Dev):**

**Contribution:** Création des maquettes Figma, classes Expatrie et Demande, diagrammes UML, backlog Jira, coordination de l'équipe, rapport final.

**Ce que j'ai appris:** 
- Importance de bien documenter les prompts IA
- Gestion des branches Git et Pull Requests
- Priorisation MoSCoW dans le Product Backlog

**Difficultés rencontrées:**
- Absence de certains membres en Sprint 1
- Problèmes de compilation sur Windows (encodage UTF-8)
- Coordination malgré les absences

**Améliorations pour le futur:**
- Réunions quotidiennes obligatoires
- Backup des fonctionnalités entre membres

## Conclusion

Le projet Rahet Belek a été développé selon Scrum sur 2 Sprints. Le prototype final est fonctionnel et démontre les interactions entre Expatrié, Prestataire et Administrateur.

L'approche hybride AGL + IA a permis un développement rapide tout en maintenant une structure cohérente. Les maquettes Figma ont facilité la validation des besoins avant le code.

**Points forts:**
- ✅ Architecture Java bien structurée
- ✅ Logique métier complète
- ✅ Documentation complète

**Points d'amélioration:**
- ⚠️ Présence de toute l'équipe dès Sprint 1
- ⚠️ Revue de code systématique
