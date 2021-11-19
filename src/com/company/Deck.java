package com.company;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Deck {
   private List<Card> deck = new ArrayList<>();

   public List<Card> generateDeck(){
      for(CardValue cardValue:CardValue.values()){
         for (Suit suit:Suit.values()){
            deck.add(new Card(suit,cardValue));
         }
      }
      return deck;
   }

   public List<Card> shuffleCards(){
      Collections.shuffle(generateDeck());
      return deck;
   }


   @Override
   public String toString() {
      return "Deck{" +
              "deck=" + deck +
              '}';
   }
}
