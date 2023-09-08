/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personnages;

/**
 *
 * @author 202230053
 */
public class Retiaire extends Personnage {

    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    public Retiaire() {
        super();
    }

    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("\tClasse : Retiaire");
    }

    @Override
    public void setNewInitiativeRandom() {
        int newIni;
        int min = 0;
        int max = 100;
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

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        int forceDeFrappe = this.attaqueCalcul();
        int valeurDefense = personnageCible.valeurDefense;
        int dommages = forceDeFrappe - valeurDefense;
        if (dommages < 0) {
            dommages = 0;
        }
        if (personnageCible.pointsDeVie - dommages < 0) {
            personnageCible.pointsDeVie = 0;
        } else {
            personnageCible.pointsDeVie -= dommages;
        }

        System.out.println("");
        System.out.println(this.nom + " attaque avec une puissance de " + forceDeFrappe);
        System.out.println(personnageCible.nom + " a une defense de " + personnageCible.valeurDefense);
        System.out.println("Les dommages sont donc de " + dommages);
    }
}
