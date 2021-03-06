package com.company.CardDetails;

public class Card {
    private Suit suit;
    private CardValue cardValue;
    private int number;


    public Card(Suit suit, CardValue cardValue) {
        this.suit = suit;
        this.cardValue = cardValue;
        this.number = cardValue.getI();
    }
// since the Suit is constant we only need setters
    public Suit getSuit() {
        return suit;
    }

    public CardValue getCardValue() {
        return cardValue;
    }

    @Override
    public String toString() {
        return "Card{" +
                "suit=" + suit +
                ", cardValue=" + cardValue +
                ", number=" + number +
                '}';
    }
}







