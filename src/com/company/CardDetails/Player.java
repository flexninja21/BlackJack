package com.company.CardDetails;

import java.util.Stack;

public class Player {
    private String name;
    private int playerNumber;
    private int score;
    private Status status;
    private Stack<Card> hand = new Stack<>();

    public Player() {
        name =  "PLayer" + playerNumber++;
        score = score;
        this.status = Player.this.playerStrategy();
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
            status = Status.Hit;
        }
        else if (getHandValue() >=17 || getHandValue() <21){
            status = Status.Stick;

        }
        else {
            status = Status.go_Bust;
        }
        return status;
    }

    public void addCardToHand(Card card){
        hand.add(card);
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

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
