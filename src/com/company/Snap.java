package com.company;

import java.util.Scanner;
import java.io.IOException;
//import java.io.BufferedReader;
//import java.io.InputStreamReader;
//import java.util.Timer;
//import java.util.TimerTask;

public class Snap extends CardGame{
    static Scanner scan = new Scanner(System.in);
    public static void playGame() throws IOException {
        System.out.println("Starting a new game of snap!");
        System.out.println("How many players? 1-4");
        int playerAmt = scan.nextInt();
        while (playerAmt > 4 || playerAmt < 1) {
            System.out.println("Invalid amount of players. 1-4");
            playerAmt = scan.nextInt();
        }
        generatePlayers(playerAmt);
        boolean gameOver = false;
        boolean keepPlaying = true;
        while (keepPlaying) {
            String victoryList = "";
//            snapStr = "";
            emptyField();
            generateDeck();
            shuffleDeck();
            while (!gameOver) {
                for (Player player : players) {
                    if (gameOver) {
                        break;
                    }
                    if (deck.size() == 0) {
                        System.out.println("Deck Empty! Game Over!");
                        for (Player vic: players) {
                            victoryList += String.format("Player %d: %d | ", vic.playerNumber, vic.victories);
                        }
                        System.out.printf("\nVictories: %s", victoryList);
                        gameOver = true;
                    } else {
                        System.out.printf("Player %d, press enter to deal", player.playerNumber);
                        System.in.read();
                        dealCard();
                        System.out.println(getFieldTopCard());
                        if (field.size() > 1 && field.get(field.size() - 1).cardValue == field.get(field.size() - 2).cardValue) {
//                            System.out.printf("Quick Player %d, type SNAP in the next 2 seconds to win!", player.playerNumber);
//                            try {
//                                getInput();
//                            } catch (Exception e) {
//                                System.out.println(e);
//                                break;
//                            }
                            System.out.printf("Snap! Player %d Wins!", player.playerNumber);
                            player.addVictory();
                            for (Player vic: players) {
                                victoryList += String.format("Player %d: %d | ", vic.playerNumber, vic.victories);
                            }
                            System.out.printf("\nVictories: %s", victoryList);
                            gameOver = true;
                        }
                    }
                }
            }
            System.out.println("\nPlay again? Y to play again, anything else to exit");
            String again = scan.next();
            if (again.equalsIgnoreCase("y")) {
                gameOver = false;
            } else {
                keepPlaying = false;
            }
        }
    }

//    static String snapStr = "";
//    static TimerTask task = new TimerTask() {
//        public void run() {
//            if (snapStr.equals("")) {
//                System.out.println("So close!");
//            }
//        }
//    };
//
//    static void getInput() throws Exception {
//        Timer timer = new Timer();
//        timer.schedule(task, 5*1000);
//        BufferedReader buffScan = new BufferedReader(new InputStreamReader(System.in));
//        snapStr = buffScan.readLine();
//        timer.cancel();
//    }

    public Snap(String name) {
        super(name);
    }
}


