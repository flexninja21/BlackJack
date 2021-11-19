package com.company;

import java.util.Stack;

public class Player {
    private String name;
    private int Score;
    private Status status;
    private Stack<Card> hand = new Stack<>();

    public Player(String name, int score, Status status) {
        this.name = name;
        Score = score;
        this.status = status;
    }

    public PlayerHand(){



    }
}
