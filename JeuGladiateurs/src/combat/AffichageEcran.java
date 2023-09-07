package combat;

import personnages.Personnage;

public class AffichageEcran {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Méthodes d'affichage">
    public void afficherDebutCombat() {
        System.out.println("");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>> Que le combat commence ! <<<<<");
        System.out.println("<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>");
        System.out.println("");
    }
    
    public void afficherSeparateurDeTour() {
        System.out.println("");
        System.out.println("***************************************");
    }

    public void afficherSeparateurInfosPerso() {
        System.out.println("");
        System.out.println("-----------------");
        System.out.println("INFOS PERSONNAGES");
        System.out.println("-----------------");
    }

    public void afficheVictoire(Personnage personnage1, Personnage personnage2) {
        String nomGagnant;
        if (personnage1.getPointsDeVie() != 0){
            nomGagnant = personnage1.getNom();
        }
        else {
            nomGagnant = personnage2.getNom();
        }
        System.out.println("");
        System.out.println(nomGagnant + " gagne le combat! Yippee!");
        System.out.println("");
    }
    // </editor-fold>
}
