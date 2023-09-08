/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 202230053
 */
public class Mirmillon extends Personnage {

    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    public Mirmillon() {
        super();
    }

    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("\tClasse : Mirmillon");
    }

    @Override
    public void setNewInitiativeRandom() {
        int newIni;
        int min = 0;
        int max = 30;
        newIni = (int) Math.floor(Math.random() * (max - min + 1) + min);
        this.initiative = newIni;
    }

    private int attaqueCalcul() {
        int attaque;
        int min = 0;
        int max = this.valeurMaxAttaque;
        attaque = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return attaque;
    }
        
    public void mirmillionStrike(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);

        if (personnageCible.pointsDeVie == 0) {
            System.out.println("");
            System.out.println(personnageCible.nom + " est decapite!");
        } else {
            System.out.println("");
            System.out.println(this.nom + " frappe de nouveau.");
            super.frapperPersonnage(personnageCible);
        }
    }
    
    @Override
    public void frapperPersonnage(Personnage personnageCible) {
            mirmillionStrike(personnageCible);
    }
}
