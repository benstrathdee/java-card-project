package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class CardGame {
    public String name = "";
    ArrayList<Card> deck = new ArrayList<Card>();
    String[] symbols = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    int[] cardValues = {14,2,3,4,5,6,7,8,9,10,11,12,13};

    public void generateDeck() {
        for (int i=0; i<4; i++) {
            for (int j=0; j<13; j++) {
                switch (i) {
                    case 0:
                        deck.add(new Card("♠", 0, symbols[j], cardValues[j]));
                        break;
                    case 1:
                        deck.add(new Card("♧", 1, symbols[j], cardValues[j]));
                        break;
                    case 2:
                        deck.add(new Card("♦", 2, symbols[j], cardValues[j]));
                        break;
                    case 3:
                        deck.add(new Card("♥", 3, symbols[j], cardValues[j]));
                        break;
                    default:
                        System.out.println("Hmm, something went wrong.");
                }
            }
        }
    }
    public ArrayList<Card> getDeck() {
        return deck;
    }
    public void sortDeckIntoSuits() {
        Collections.sort(deck, new SuitComparator());
    }
    public void sortDeckInNumberOrder() {
        Collections.sort(deck, new ValueComparator());
    }
    public void shuffleDeck() {
        Collections.sort(deck, new RandomComparator());
    }

    public Card dealCard() {
        return deck.get(0);
    }

    public CardGame(String name) {
        this.name = name;
    }
}
