package com.company;

import java.util.Scanner;
import java.util.Stack;

public class Game {
    public static void game() {
        boolean continuing = true;
        while (continuing) {
            Scanner input = new Scanner(System.in);
            int tries = 0;
            String word = Word.word();
            Boolean playing = true;
            Stack<Character> chars = new Stack<Character>();
            for (int i = 0; i < word.length(); i++) {
                chars.add(word.charAt(i));
            }
            Stack<Character> missed = new Stack<Character>();
            Stack<Character> correct = new Stack<Character>();
            for (int i = 0; i < word.length(); i++) {
                correct.add('_');
            }
            System.out.println((Display.display(tries)) +"\n" + "Missed letters:" + missed + "\n" + correct + "\nGuess a letter");
            while (playing) {
                String attempt = input.next();
                char guess = attempt.charAt(0);
                if (Character.isLetter(guess) && attempt.length() < 2) {
                    if (missed.contains(guess)) {
                        System.out.println("You have already guessed that letter. Choose again.");
                    } else {
                        if (!chars.contains(guess)) {
                            tries++;
                            missed.add(guess);
                        } else {
                            for (int i = 0; i < word.length(); i++) {
                                if (word.charAt(i) == guess) {
                                    correct.set(i, guess);
                                }
                            }
                        }
                    }
                    System.out.println(Display.display(tries));
                    if (tries == 6) {
                        System.out.println("Oh no, it seems you have lost. The secret word was " + word + ".");
                        playing = false;
                    } else {
                        System.out.println("Missed letters:" + missed + "\n" + correct + "\nGuess a letter.");
                    }
                } else {
                    System.out.println("Please enter a single letter guess.");
                }
                if (!correct.contains('_')) {
                    System.out.println("Yes! The secret word is \" " + word + "! You have won!");
                    playing = false;
                }
            }
            System.out.println("Do you want to play again? (yes or no)");
            String reply = input.next();
            try {
                if (reply.equals("yes")) {
                    continuing = true;
                } else if (reply.equals("no")) {
                    continuing = false;
                    System.out.println("Thank you for playing!");
                } else {
                    System.out.println("Error. Reply was not an option; ending game.");
                    continuing = false;
                }
            } catch (Exception e) {
                System.out.println("Error. Reply was not an option; ending game.");
            }
        }
    }
}
