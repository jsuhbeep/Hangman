package com.company;

public class Display {
    public static String display(Integer miss) {
        String art = new String();
        if (miss == 0) {
            art = "  +---+\n      |\n      |\n      |\n     ===";
        } else if (miss == 1) {
            art = "  +---+\n  o   |\n      |\n      |\n     ===";
        } else if (miss == 2) {
            art = "  +---+\n  o   |\n  |   |\n      |\n     ===";
        } else if (miss == 3) {
            art = "  +---+\n  o   |\n  |   |\n /    |\n     ===";
        } else if (miss == 4) {
            art = "  +---+\n  o   |\n  |   |\n / \\  |\n     ===";
        } else if (miss == 5) {
            art = "  +---+\n  o   |\n /|   |\n / \\  |\n     ===";
        } else if (miss == 6) {
            art = "  +---+\n  o   |\n /|\\  |\n / \\  |\n     ===";
        }
        return art;
    }
}
