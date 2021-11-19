package com.company.CardDetails;

import java.util.Stack;

public class Player {
    private String name;
   // private int playerNumber = 0;
    private Status status;
    private Stack<Card> hand = new Stack<>();

    public Player(String name) {
        this.name = name;
       // this.status = Player.this.playerStrategy();
    }

    public int getHandValue(){
        int score = 0;
        for(Card card :getHand() ){
            score = score + card.getCardValue().getI();
        }
        return score;
    }
    public Stack<Card> getHand(){
        return hand;
    }
//    public Status playerStrategy(){
//        if(getHandValue() < 17){
//            status = Status.Hit;
//            ;
//        }
//        else if (getHandValue() >=17 || getHandValue() <21){
//            status = Status.Stick;
//
//        }
//        else {
//            status = Status.go_Bust;
//        }
//        return status;
//    }
    public void addHand(Card card){
        hand.add(card);
    }


    @Override
    public String toString() {
        return "Play0er{" +
                "name='" + name + '\'' +
                ", score=" + getHandValue() +
                ", status=" + status +
                ", hand=" + hand +
                '}';
    }

    public Status getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }
}
