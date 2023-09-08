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

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Mirmillon(String nom, int attaqueMax, int defense, int pvs, int ini) {
        super(nom, attaqueMax, defense, pvs, ini);
    }

    public Mirmillon() {
        super();
    }

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("\tClasse : Mirmillon");
    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);

        if (personnageCible.getPointsDeVie() == 0) {
            System.out.println("");
            System.out.println(personnageCible.getNom() + " est decapite!");
        } else {
            System.out.println("");
            System.out.println(this.nom + " frappe de nouveau!");
            super.frapperPersonnage(personnageCible);
        }
    }
    // </editor-fold>
}
