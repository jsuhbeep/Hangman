package com.company;

import java.util.Random;

public class Word {
    public static String[] words = {"cat","letter", "java", "play", "hangman", "computer", "word"};

    public static String word() {
        Random random = new Random();
        return words[random.nextInt(6)];
    }
}
