package com.company.Test;

import com.company.Deck;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
Deck cardDeck = new Deck();

    @Test
    void generateDeck() {
        assertEquals(52,cardDeck.generateDeck().size());
    }

    @Test
    void shuffleCards() {
        assertFalse(cardDeck.generateDeck().get(12) == cardDeck.shuffleCards().get(12));
        assertFalse(cardDeck.generateDeck().get(52) == cardDeck.shuffleCards().get(52));
        assertFalse(cardDeck.generateDeck().get(30) == cardDeck.shuffleCards().get(30));
    }
}