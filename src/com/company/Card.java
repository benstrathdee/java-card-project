package com.company;
import java.util.Comparator;

public class Card {
    public String suit;
    public int suitValue;
    public String symbol;
    public int cardValue;

    public String toString() {
        return String.format("\n%s of %s", symbol, suit);
    }

    public Card(String suit, int suitValue, String symbol, int cardValue) {
        this.suit = suit;
        this.suitValue = suitValue;
        this.symbol = symbol;
        this.cardValue = cardValue;
    }
}