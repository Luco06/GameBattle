package com.cursan.GameBattle;

public class Guerrier extends Caracter {

    /**
     * Constructeur de Joueur
     *
     * @param numJoueur    numéro du joueur
     * @param force        force du joueur
     * @param agilite      agilité du joueur
     * @param intelligence intelligence du joueur
     */
    Guerrier(int numJoueur, int force, int agilite, int intelligence) {
        super(numJoueur, force, agilite, intelligence);
        type = "Guerrier";
        cri = "Wouarggg";
    }

    /**
     * @param choix choix de l'action
     * @return phrase de l'action
     * @see Mage#jouer(int)
     * @see Caracter#jouer(int)
     * @see Rôdeur#jouer(int)
     */
    @Override
    protected String jouer(int choix) {
        String phrase = "";
        switch (choix) {
            case 1:
                adversaire.retraitVie(force);
                phrase = phrase + nom + " utilise Coup d'épée et inflige " + force + " de dégâts";
                break;
            case 2:
                adversaire.retraitVie((force * 2));
                phrase = phrase + nom + " utilise Coup de rage, inflige " + (force * 2) + " de dégâts et perd " + (force / 2) + " de vitalité";
                break;
            default:
                break;
        }
        if (vie > 0) {
            return phrase;
        } else {
            return "Le" + nom + " n'a plus de points de vie, il a perdu !";
        }
    }
}
