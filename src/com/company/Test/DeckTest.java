package com.company.Test;

import com.company.CardDetails.Card;
import com.company.CardDetails.Deck;
import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {
Deck cardDeck = new Deck();
 Stack<Card> deck = new Stack<>();
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

    @Test
    void drawCard(){
        cardDeck.generateDeck();
        cardDeck.drawCard();
       assertEquals(51,cardDeck.getDeck().size());
    }
}