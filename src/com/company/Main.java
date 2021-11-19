package com.company;

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


    }
}
