package com.cursan.GameBattle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int numJoueur = 1;
        Caracter caracter1 = creerJoueur(numJoueur);
        System.out.println(Joueur1.ToString());
        numJoueur++;
        Caracter caracter2 = creerJoueur(numJoueur);
        System.out.println(Joueur2.TosString);
        Joueur1.setAdversaire(Joueur2);
        Joueur2.setAdversaire(Joueur1);
        Joueur1.activeJoueur();
    }

    /**
     * @param numJoueur numéro du joueur
     * @return Joueur créé grâce au caractéristique donner.
     */
    private static Caracter creerJoueur(int numJoueur) {
        Joueur J;
        int type, niveau, force, agilite, inteligence;
        System.out.println(("Création du personnage du Joeur" + numJoueur));
        type = demande("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3 : Mage)", 1, 3);
        do {
            niveau = demande("Niveau du personnage ?", 1);
            force = demande("Force du personnage ?", 0);
            agilite = demande("Agilite du personnage ?", 0);
            inteligence = demande("Intelligence du personnage ?", 0);
            if (force + agilite + inteligence != niveau) {
                System.out.println("Attention le total des caractéristique doit être égal au niveau du joueur.");
            }
        } while (force + agilite + inteligence != niveau);
        switch (type) {
            case 1:
                J = new Guerrier(numJoueur, force, agilite, inteligence);
                break;
            case 2:
                J = new Rôdeur(numJoueur, force, agilite, inteligence);
                break;
            case 3:
                J = new Mage(numJoueur, force, agilite, inteligence);
                break;
        }
        return J;
    }

    /**
     * Effectue une demande et retourne la  réponse numérique.
     *
     * @param dmd la demande a faire.
     * @param min la valeur minimale du choix
     * @return le choix fait par l'utilisateur
     */
    public static int demande(String dmd, int min) {
        int choice;
        boolean choiceCorrect;
        Scanner sc = new Scanner(System.in);
        do {
            choice = 0;
            System.out.println(dmd);
            try {
                choiceCorrect = true;
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                sc.next();
                choiceCorrect = false;
            }

            if (choiceCorrect) {
                if (!(choice >= min)) choiceCorrect = false;
            }
        }while (!choiceCorrect) ;
            return choice;

    }

    /**
     * Effctue une demande et retourne la réponse.
     * @param dmd la demande a faire.
     * @param min la valeur minimale du choix
     * @param max valeur maximale du choix
     * @return le choix par le joueur
     */

    public static int demande(String dmd, int min, int max) {
        int choice;
        do {
            choice = demande(dmd, min);
        } while (choice > max);
        return choice;
    }
}
