package com.company;


import java.util.ArrayList;
import java.util.List;

public class Deck {
   private List<Card> deck = new ArrayList<>();
   public CardDeck(){
      for(CardValue cardValue:CardValue.values()){
         for (Suit suit:Suit.values()){
            deck.add(new Card(suit,cardValue));

         }
      }
   }


   @Override
   public String toString() {
      return "Deck{" +
              "deck=" + deck +
              '}';
   }
}
