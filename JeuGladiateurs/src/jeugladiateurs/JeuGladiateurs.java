package jeugladiateurs;

import personnages.Mirmillon;
import personnages.Retiaire;
import combat.CompteurDeTour;
import combat.AffichageEcran;
import java.util.HashSet;
import java.util.Set;

public class JeuGladiateurs {
    
    public static void main(String[] args) {

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="expanded" desc="Instanciation des objets">
        CompteurDeTour tour = new CompteurDeTour();
        AffichageEcran affichage = new AffichageEcran();
        Mirmillon Bob = new Mirmillon("Bob le malchanceux", 15, 15, 70, 15);
        Retiaire Igor = new Retiaire("Igor l'empaleur", 25, 5, 100, 30);
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Affichage pré-combat">
        Bob.afficherInfosPersonnage();
        Igor.afficherInfosPersonnage();
        affichage.afficherDebutCombat();
        // </editor-fold>

        // **************************************************************************
        // **************************************************************************
        // **************************************************************************
        // <editor-fold defaultstate="collapsed" desc="Mécanique de combat">
        while (Bob.getPointsDeVie() != 0 && Igor.getPointsDeVie() != 0) {
            tour.afficheTour();
            for (int i = 0; i < 101; i++) {
                if (Bob.getInitiative() == i && Bob.getPointsDeVie() != 0) {
                    Bob.frapperPersonnage(Igor);
                } else if (Igor.getInitiative() == i && Igor.getPointsDeVie() != 0) {
                    Igor.frapperPersonnage(Bob);
                }
            }
            affichage.afficherSeparateurInfosPerso();
            
            Bob.afficherInfosPersonnage();
            Igor.afficherInfosPersonnage();
            
            Bob.setNewInitiativeRandom();
            Igor.setNewInitiativeRandom();
            
            tour.augmenteTour();
            affichage.afficherSeparateurDeTour();
        }
        affichage.afficheVictoire(Bob, Igor);

        // </editor-fold>
    }
    
}
