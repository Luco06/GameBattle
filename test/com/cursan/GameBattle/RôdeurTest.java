package com.cursan.GameBattle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RôdeurTest {
    @Test
    public final void testRôdeurDescription() {
        Rôdeur rôdeur = new Rôdeur(1, 10, 12, 8);
        assertEquals(rôdeur.toString(), "Houhouu ! Je suis le Rôdeur, Joueur1, niveau 30, je possède 150 de vitalité, 10 de force, 12 d'agilité et 8 d'intelligence.");

    }
    @Test
    public final void testRôdeurJouerCoupClassique() {
        Rôdeur rôdeur = new Rôdeur(1, 10, 12, 8);
        Rôdeur adversaire = new Rôdeur(2, 10, 12, 8);
        rôdeur.setAdversaire(adversaire);
        assertEquals(rôdeur.jouer(1), "Joueur1 utilise Tir à l'Arc et inflige 12 de dégâts");
    }
    @Test
    public final void testRôdeurJouerCoupSpecial() {
        Rôdeur rôdeur = new Rôdeur(1, 10, 12, 8);
        Rôdeur adversaire = new Rôdeur(2, 10, 12, 8);
        rôdeur.setAdversaire(adversaire);
        assertEquals(rôdeur.jouer(2), "Joueur1 utilise Concentration et gagne 15 d'agilité");
    }
}