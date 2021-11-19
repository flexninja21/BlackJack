package com.company;

import com.company.CardDetails.Card;
import com.company.CardDetails.Deck;
import com.company.CardDetails.Player;
import com.company.CardDetails.Status;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BlackJackgame {
    private Deck deck;
    private List<Player> players;
    private boolean isWinner = false;
    private List<Player> losers;


    public BlackJackgame(Deck deck, List<Player> players) {
        this.deck = deck;
        this.players = players;
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

            }
        }
    }

    public void playerRules() {
        for (Player player : players) {
            //player.playerStrategy();
        }
    }

    public void dealHitOrNot() {
        //kwame helped that i should rather use a while
        while (!isWinner) {
            for (int i = 0; i < players.size(); i++) {

                if (i == players.size() - 1) {
                    compute();

                }
            }

            players.removeAll(losers);

            if(players.size() == 1){
                System.out.println(players.get(0).getName() +  " winner nie");
                isWinner = true;
            }

            if (players.size() == 0){
                System.out.println("ooops there is no winnerrrrrr");
                isWinner = true;
            }


        }
    }

    public void compute() {
       List<Player> hitters = players.stream().filter(x-> x.getHandValue()<17).collect(Collectors.toList());
       List<Player> stickers = players.stream().filter(x-> x.getHandValue()>=17 && x.getHandValue()<21).collect(Collectors.toList());
       losers = players.stream().filter(x-> x.getHandValue()>21).collect(Collectors.toList());

       if (hitters.size() > 0) {
           for (int i=0; i<players.size(); i++) {
               String name = players.get(i).getName();
               Optional<Player> player = hitters.stream().filter(x -> x.getName().equals(name)).findFirst();

               if (player.isPresent()) {
                   players.get(i).addHand(deck.drawCard());
               }

           }
       }

       if (stickers.size() >0) {
           for (Player player : stickers) {

           }
       }

    }
}
