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

    boolean hasNet = true;

    public boolean hasNet() {
        return hasNet;
    }

    public void setHasNet(boolean hasNet) {
        this.hasNet = hasNet;
    }

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
    public void frapperPersonnage(Personnage personnageCible) {
        retiaireGambit(personnageCible);
    }

    public void retiaireGambit(Personnage personnageCible) {
        int rand;

        if (hasNet()) {
            this.hasNet = false;
            System.out.println("");
            System.out.println(this.nom + " lance son filet.");

            rand = (int) Math.floor(Math.random() * (11));
            if (rand == 0) {
                System.out.println("");
                System.out.println("Son filet attrape " + personnageCible.nom + " et il l'empale sauvagement avec sa lance!");
                personnageCible.pointsDeVie = 0;
            } else {
                System.out.println("");
                System.out.println(personnageCible.nom + " l'esquive!");
            }

        } else {
            this.hasNet = true;
            System.out.println("");
            System.out.println(this.nom + " ramasse son filet et en profite pour attaquer!");
            super.frapperPersonnage(personnageCible);
        }
    }
}
