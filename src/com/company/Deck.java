package com.company;


import java.util.ArrayList;
import java.util.List;

public class Deck {
   private List<Card> deck = new ArrayList<>();
   public Deck(){
      for(CardValue cardValue:CardValue.values()){
         for (Suit suit:Suit.values()){
            deck.add(new Card(suit,cardValue));
         }
      }
   }

   public List<Card> getDeck() {
      return deck;
   }

   @Override
   public String toString() {
      return "Deck{" +
              "deck=" + deck +
              '}';
   }
}
