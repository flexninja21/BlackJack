package com.company;


import java.util.*;

public class Deck {
   private Stack<Card> deck = new Stack<>();



   public Stack<Card> generateDeck(){
      for(CardValue cardValue:CardValue.values()){
         for (Suit suit:Suit.values()){
            deck.add(new Card(suit,cardValue));

         }
      }
      return deck;
   }

   public Stack<Card> shuffleCards(){
      Collections.shuffle(generateDeck());
      return deck;
   }
   public Card drawCard{
      shuffleCards().push();

   }


   @Override
   public String toString() {
      return "Deck{" +
              "deck=" + deck +
              '}';
   }
}
