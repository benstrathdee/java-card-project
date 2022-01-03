package com.company;

public class Main {

    public static void main(String[] args) {
        CardGame snap = new CardGame("snap");
        snap.generateDeck();
        System.out.println("Default sort:");
        System.out.println(snap.getDeck());
        snap.sortDeckIntoSuits();
        System.out.println("Suit sort:");
        System.out.println(snap.getDeck());
        snap.sortDeckInNumberOrder();
        System.out.println("Number sort:");
        System.out.println(snap.getDeck());
        snap.shuffleDeck();
        System.out.println("Shuffled:");
        System.out.println(snap.getDeck());
        System.out.printf("Your card is the %s", snap.dealCard());
    }
}
