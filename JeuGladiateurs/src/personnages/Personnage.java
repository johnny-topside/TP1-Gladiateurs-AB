package personnages;

public class Personnage {

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Attributs">
    String nom;
    int pointsDeVie;
    int valeurMaxAttaque;
    int valeurDefense;
    int initiative;

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Constructeurs et initialisation">
    public Personnage(String nom, int attaqueMax, int defense, int pvs, int ini) {
        this.nom = nom;
        this.pointsDeVie = pvs;
        this.valeurMaxAttaque = attaqueMax;
        this.valeurDefense = defense;
        this.initiative = ini;
    }

    public Personnage() {
        this.nom = "";
        this.pointsDeVie = 0;
        this.valeurMaxAttaque = 0;
        this.valeurDefense = 0;
        this.initiative = 0;
    }
    // </editor-fold>

    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Getters et setters">
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPointsDeVie() {
        return pointsDeVie;
    }

    public void setPointsDeVie(int pointsDeVie) {
        this.pointsDeVie = pointsDeVie;
    }

    public int getValeurMaxAttaque() {
        return valeurMaxAttaque;
    }

    public void setValeurMaxAttaque(int valeurMaxAttaque) {
        this.valeurMaxAttaque = valeurMaxAttaque;
    }

    public int getValeurDefense() {
        return valeurDefense;
    }

    public void setValeurDefense(int valeurDefense) {
        this.valeurDefense = valeurDefense;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    // </editor-fold>
    // **************************************************************************
    // **************************************************************************
    // **************************************************************************
    // <editor-fold defaultstate="collapsed" desc="Mécanique de jeu">
    public void afficherInfosPersonnage() {
        System.out.println();
        System.out.println(this.nom);
        System.out.println("\tAttaque : " + this.valeurMaxAttaque);
        System.out.println("\tDefense : " + this.valeurDefense);
        System.out.println("\tPoints de vie : " + this.pointsDeVie);
        System.out.println("\tInitiative : " + this.initiative);
        if (this.getPointsDeVie() <= 0) {
            System.out.println("\tStatut : Mort");
        } else {
            System.out.println("\tStatut : Vivant");
        }
    }

    private int attaqueCalcul() {
        int attaque;
        int min = 0;
        int max = this.valeurMaxAttaque;
        attaque = (int) Math.floor(Math.random() * (max - min + 1) + min);
        return attaque;
    }

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

    public void setNewInitiativeRandom() {
        int newIni;
        int min = 0;
        int max = 100;
        newIni = (int) Math.floor(Math.random() * (max - min + 1) + min);
        this.initiative = newIni;
    }
    // </editor-fold>
}
