package com.company;

import java.util.ArrayList;

public class CardGame {
    static public String name = "";
    static ArrayList<Card> deck = new ArrayList<>();
    static ArrayList<Card> field = new ArrayList<>();
    static ArrayList<Player> players = new ArrayList<>();
    static String[] symbols = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    static int[] cardValues = {14,2,3,4,5,6,7,8,9,10,11,12,13};

    public static void generateDeck() {
        deck.clear();
        for (int i=0; i<4; i++) {
            for (int j=0; j<13; j++) {
                switch (i) {
                    case 0 -> deck.add(new Card("♠", 0, symbols[j], cardValues[j]));
                    case 1 -> deck.add(new Card("♧", 1, symbols[j], cardValues[j]));
                    case 2 -> deck.add(new Card("♦", 2, symbols[j], cardValues[j]));
                    case 3 -> deck.add(new Card("♥", 3, symbols[j], cardValues[j]));
                    default -> System.out.println("Hmm, something went wrong.");
                }
            }
        }
    }
    public static ArrayList<Card> getDeck() {
        return deck;
    }
    public static void sortDeckInNumberOrder() {
        deck.sort(new ValueComparator());
    }
    public static void sortDeckIntoSuits() {
        deck.sort(new SuitComparator());
    }
    public static void shuffleDeck() {
        deck.sort(new RandomComparator());
    }
    public static Card getDeckTopCard() {
        return deck.get(0);
    }
    public static Card getFieldTopCard() {
        return field.get(field.size()-1);
    }
    public static void emptyField() {
        field.clear();
    }
    public static void prepareGame() {
        emptyField();
        generateDeck();
        shuffleDeck();
//        uncomment this for easier testing:
//        sortDeckInNumberOrder();
    }
    public static void dealCard() {
        field.add(deck.get(0));
        deck.remove(0);
    }
    public static void generatePlayers(int amount) {
        for (int i=0; i<amount; i++) {
            players.add(new Player(i+1));
        }
    }

    public CardGame(String name) {
        this.name = name;
    }
}
