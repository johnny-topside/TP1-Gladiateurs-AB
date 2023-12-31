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
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    String nomClasse = "Mirmillon";
    // </editor-fold>
    
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
    // <editor-fold defaultstate="collapsed" desc="M�canique de jeu">
    @Override
    public void afficherInfosPersonnage() {
        super.afficherInfosPersonnage();
        System.out.println("\tClasse : " + this.nomClasse);
    }

    @Override
    public void setNewInitiativeRandom() {
        int rand;
        int min = 0;
        int max = 30;
        rand = (int) Math.floor(Math.random() * (max - min + 1) + min);
        this.initiative = rand;
    }

    @Override
    public void frapperPersonnage(Personnage personnageCible) {
        super.frapperPersonnage(personnageCible);

        if (personnageCible.getPointsDeVie() == 0) {
            System.out.println("");
            System.out.println(personnageCible.getNom() + " est d�capit�!");
        } else {
            System.out.println("");
            System.out.println(this.nom + " frappe de nouveau!");
            super.frapperPersonnage(personnageCible);
        }
    }
    // </editor-fold>
}
