package org.example.game;

public class Game {
    private int[] rolls = new int[21];
    private int currentRoll = 0;

    public void roll(int pins) {
        rolls[currentRoll++] = pins;
    }

    private int score;
    public int score() {
        score = 0;
        return score;
    }
}
