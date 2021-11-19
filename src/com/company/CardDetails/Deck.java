package com.company.CardDetails;


import java.util.*;

public class Deck {
   private Stack<Card> deck = new Stack<>();



   public Stack<Card> generateDeck(){
      for(CardValue cardValue:CardValue.values()){
         for (Suit suit:Suit.values()){
            deck.push(new Card(suit,cardValue));

         }
      }
      return deck;
   }

   public Stack<Card> shuffleCards(){
      Collections.shuffle(generateDeck());
      return deck;
   }

   public Card drawCard(){
     Card drawCard =  deck.pop();

     return drawCard;
   }

   public Stack<Card> getDeck() {
      return deck;
   }

   @Override
   public String toString() {
      return "Deck{" +
              "deck=" + deck +
              '}';
   }
}
