package com.company;

import com.company.CardDetails.Deck;
import com.company.CardDetails.Player;

public class Main {

    public static void main(String[] args) {
	// write your code
//       Card fred = new Card(Suit.Clubs,CardValue.Ace);
//        System.out.println(fred);
        Deck dick = new Deck();
        dick.generateDeck();
        dick.shuffleCards();
        System.out.println(dick.drawCard());
        System.out.println(dick.drawCard());
        Player one = new Player("Player 1");
        System.out.println(one);
        Player two = new Player("Player 2");
        System.out.println(two);

    }
}
