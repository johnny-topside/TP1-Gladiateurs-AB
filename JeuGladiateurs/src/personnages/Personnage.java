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
    public void afficherInfosPersonnage(Personnage x) {
        System.out.println();
        System.out.println(x.getNom());
        System.out.println("\tAttaque : " + x.getValeurMaxAttaque());
        System.out.println("\tDefense : " + x.getValeurDefense());
        System.out.println("\tPoints de vie : " + x.getPointsDeVie());
        System.out.println("\tInitiative : " + x.getInitiative());
        if (x.getPointsDeVie() <= 0) {
            System.out.println("\tStatut : Mort");
        }
        else {
            System.out.println("\tStatut : Vivant");
        }
    }

    private int attaqueCalcul() {
        int attaque;
        int min = 0;
        int max = this.valeurMaxAttaque;
        attaque = (int)Math.floor(Math.random()* (max - min + 1) + min);
        return attaque;
    }

    public void frapperPersonnage(Personnage personnageCible) {
        // TODO : Récupérer la valeur d'attaque pour ce tour, calculer les dégats,
        //modifier les points de vie du personnage cible, afficher les détails
        // sur l'attaque, tel que montré dans l'énoncé.
    }

    public void setNewInitiativeRandom() {
        // TODO : Modifier de façon aléatoire la valeur INI du personnage.
    }
    // </editor-fold>
}
