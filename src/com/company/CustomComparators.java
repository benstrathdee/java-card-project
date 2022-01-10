package com.company;

import java.util.Comparator;

class ValueComparator implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        int cardValue1 = card1.cardValue;
        int cardValue2 = card2.cardValue;
        int suitValue1 = card1.suitValue;
        int suitValue2 = card2.suitValue;
        return cardValue1 == cardValue2 ? (suitValue1 > suitValue2 ? 1 : -1) : (cardValue1 > cardValue2 ? 1 : -1);
    }
}

class SuitComparator implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        int cardValue1 = card1.cardValue;
        int cardValue2 = card2.cardValue;
        int suitValue1 = card1.suitValue;
        int suitValue2 = card2.suitValue;
        return suitValue1 == suitValue2 ? (cardValue1 > cardValue2 ? 1 : -1) : (suitValue1 > suitValue2 ? 1 : -1);
    }
}

class RandomComparator implements Comparator<Card> {
    public int compare(Card card1, Card card2) {
        return Math.random() > Math.random() ? 1 : -1;
    }
}