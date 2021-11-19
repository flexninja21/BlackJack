package com.company.Test;

import com.company.Card;
import com.company.CardValue;
import com.company.Suit;

import static org.junit.jupiter.api.Assertions.*;

class CardValueTest {
    Card card = new Card(Suit.Clubs, CardValue.Ace);

    @org.junit.jupiter.api.Test
    void getI() {
        assertEquals(11, CardValue.Ace.getI());
    }

    @org.junit.jupiter.api.Test
    void values() {
        assertEquals("Two", CardValue.Two.toString());
    }
}