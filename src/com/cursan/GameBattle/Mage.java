package com.cursan.GameBattle;

public class Mage extends Caracter {

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
    }

    @Override
    protected String jouer(int choix) {
        return null;
    }
}
