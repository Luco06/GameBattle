package com.cursan.GameBattle;

public class Mage extends Caracter {
    /**
     * Vie max du Mage lors de la création du personnage
     */

    private int vieMax;


    /**
     * Constructeur de Joueur
     *
     * @param numJoueur    numéro du joueur
     * @param force        force du joueur
     * @param agilite      agilité du joueur
     * @param intelligence intelligence du joueur
     */
    Mage(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        type = "Mage";
        cri = "Abracadabraaa";
        vieMax = vie;
    }

    /**
     * En fonction du choix, effectue les actions propres à la classe du joueur Mage
     * boule de feu ou Soin
     *
     * @param choix choix de l'action
     * @return phrase de l'action
     * @see Rôdeur#jouer(int)
     * @see Caracter#jouer(int)
     * @see Guerrier#jouer(int)
     */

    @Override
    protected String jouer(int choix) {
        String phrase = "";
        switch (choix) {
            case 1:
                adversaire.retraitVie(intelligence);
                phrase = phrase + nom + " utilise boule de feu et inflige " + intelligence + " de dégâts";
                break;
            case 2:
                phrase = phrase + nom + " utilise Soin et gagne ";
                if ((intelligence * 2) + vie > vieMax) {
                    phrase = phrase + (vieMax - vie) + " de vitalité";
                    vie = vieMax;
                } else {
                    phrase = phrase + (intelligence * 2) + " de vitalité";
                    vie = vie + (intelligence * 2);
                }
                break;
            default:
                break;
        }
        return phrase;
    }
}
