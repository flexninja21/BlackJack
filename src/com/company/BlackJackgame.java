package com.company;

import com.company.CardDetails.Card;
import com.company.CardDetails.Deck;
import com.company.CardDetails.Player;
import com.company.CardDetails.Status;

import java.util.ArrayList;
import java.util.List;

public class BlackJackgame {
    private Deck deck;
    private List<Player> players;
    private boolean isWinner = true;


    public BlackJackgame(Deck deck, List<Player> players) {
        this.deck = new Deck();
        this.players = new ArrayList<>();
    }

    public void startGame() {
        this.deck.generateDeck();
        this.deck.shuffleCards();
        dealCards();

    }

    public void dealCards() {
        for (Player player : players) {
            for (int c = 1; c <= 2; c++) {
                Card card = deck.drawCard();
                player.addHand(card);
                player.getHandValue();
            }


        }
    }

    public void playerRules() {
        for (Player player : players) {
            player.playerStrategy();
        }


    }



}
