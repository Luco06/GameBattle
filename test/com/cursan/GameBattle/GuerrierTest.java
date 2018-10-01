package com.cursan.GameBattle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuerrierTest {
    @Test
    public final void testGuerrierDescription() {
        Guerrier guerrier = new Guerrier(1, 10,12,8);
        assertEquals(guerrier.toString(), "Wouarggg ! Je suis le Guerrier, Joueur 1, niveau 30, je possède 150 de vitalité, 10 de force, 12 d'agilité et 8 d'intelligence.");
    }

}