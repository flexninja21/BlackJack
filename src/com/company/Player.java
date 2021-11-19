package com.company;

import java.util.List;
import java.util.Stack;

public class Player {
    private String name;
    private int score;
    private Status status;
    private Stack<Card> hand = new Stack<>();

    public Player(String name, int score, Status status) {
        this.name = name;
        score = score;
        this.status = status;
    }

    public int getHandValue(){
        score = 0;
        for(Card card :getHand() ){
            score = score + card.getCardValue().getI();
        }
        return score;
    }
    public Stack<Card> getHand(){
        return hand;
    }
}
