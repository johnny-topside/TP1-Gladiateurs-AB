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

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    boolean hasNet = true;
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public boolean hasNet() {
        return hasNet;
    }

    public void setHasNet(boolean hasNet) {
        this.hasNet = hasNet;
    }
    //</editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public Retiaire(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    public Retiaire() {
        super();
    }

    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("\tClasse : Rétiaire");
    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        int rand;

        if (hasNet()) {
            this.hasNet = false;
            System.out.println("");
            System.out.println(this.nom + " lance son filet.");

            rand = (int) Math.floor(Math.random() * (10));
            if (rand == 0) {
                System.out.println("");
                System.out.println("Son filet attrape " + personnageCible.getNom() + " et il l'empale sauvagement avec sa lance!");
                personnageCible.setPointsDeVie(0);
            } else {
                System.out.println("");
                System.out.println(personnageCible.getNom() + " l'esquive!");
            }

        } else {
            this.hasNet = true;
            System.out.println("");
            System.out.println(this.nom + " ramasse son filet et en profite pour attaquer!");
            super.frapperPersonnage(personnageCible);
        }
    }
// </editor-fold>
}
