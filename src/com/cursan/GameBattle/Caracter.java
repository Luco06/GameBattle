package com.cursan.GameBattle;

public abstract class Caracter {

    protected String nom, cri, type;
    protected int niveau, vie, force, agilite, intelligence;
    protected Caracter adversaire;

    /**
     * Constructeur de Joueur
     *
     * @param numJoueur numéro du joueur
     * @param force force du joueur
     * @param agilite agilité du joueur
     * @param intelligence intelligence du joueur
     */
    Caracter(int numJoueur, int force, int agilite, int intelligence) {
        nom = "Joueur" + numJoueur;
        niveau = force + agilite + intelligence;
        this.force = force;
        this.agilite = agilite;
        this.intelligence = intelligence;
        vie = niveau * 5;
    }

    /**
     * Début du tour du joueur. vérifie qu'il lui a encore de la vie pour jouer sinon fin du jeu.
     */
    public void activeJoueur() {
        int choix;
        if (vie > 0) {
            do {
                choix = Main.demande(nom + "(" + vie + " vitalité), veuillez choisir action( 1 : attaque basique, 2 : attaque spéciale)",1, 2);
                if (choix != 1 && choix != 2) System.out.println("Entrez une valeur correcte !");
            } while (choix != 1 && choix != 2);
            System.out.println(this.jouer(choix));
            if (vie <= 0) return;
            this.adversaire.activeJoueur();
       } else {
            System.out.println("Le" + nom + " à perdu !");
        }
    }
    /**
     * retrait des points de vie de l'adversaire
     * @param pointsAEnlever nombre de point de vie retirer a l'adversaire.
     */
    protected void retraitVie(int pointsAEnlever) {
        vie = vie - pointsAEnlever;
    }

    /**
     * Selon le choix, effectue les actions selon les classes du jeu
     * @param choix choix d el'action
     * @see Mage#jouer(int)
     * @see Rôdeur#jouer(int)
     * @see Guerrier#jouer(int)
     * @return résultat de l'attaque
     */
    protected abstract String jouer(int choix);

    /**
     * désigne l'adversaire du joueur
     * @param adversaire joueur désigner comme adversaire
     */
    public void setAdversaire(Caracter adversaire) {
        this.adversaire = adversaire;
    }

    /**
     * retourne la description du joueur
     * @return phrase de description
     */
    public String toString() {
        return cri + " ! Je suis le " + type + ", " + nom + ", niveau " + niveau + ", je possède " + vie + " de vitalité, " + force + " de force, " + agilite + " d'agilité et " + intelligence + " d'intelligence.";
    }

}
