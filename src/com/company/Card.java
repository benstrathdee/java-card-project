package com.company;

public class Card {
    public String suit;
    public int suitValue;
    public String symbol;
    public int cardValue;

    public String toString() {
        return String.format("%s of %s", symbol, suit);
    }

    public Card(String suit, int suitValue, String symbol, int cardValue) {
        this.suit = suit;
        this.suitValue = suitValue;
        this.symbol = symbol;
        this.cardValue = cardValue;
    }
}