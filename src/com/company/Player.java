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
    public Status playerStrategy(){
        if(getHandValue() < 17){
            status = Status.Stick;
        }
        else if (getHandValue() >=17 || getHandValue() <21){
            status = Status.Hit;

        }
        else {
            status = Status.go_Bust;
        }
        return status;
    }

    @Override
    public String toString() {
        return "Play0er{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", status=" + status +
                ", hand=" + hand +
                '}';
    }

    public void setHand(Stack<Card> hand) {
        this.hand = hand;
    }
}
