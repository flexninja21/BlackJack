package com.company;

import com.company.CardDetails.Deck;
import com.company.CardDetails.Player;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code
//       Card fred = new Card(Suit.Clubs,CardValue.Ace);
//        System.out.println(fred);
        Deck shuf = new Deck();
        shuf.generateDeck();
        shuf.shuffleCards();
        System.out.println(shuf.drawCard());
        System.out.println(shuf.drawCard());
        Player one = new Player("Player 1");

        Player two = new Player("Player 2");


        List<Player> players = new ArrayList<>(List.of(one, two));

        BlackJackgame blackJackgame = new BlackJackgame(shuf, players);

        blackJackgame.dealHitOrNot();

    }
}
