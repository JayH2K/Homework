package io.codelex.enums.exercise2;

public class CalculateGame {

    int winPercent;
    int lossPercent;

    public CalculateGame(int gamesTotal, int gamesWon, int gamesLost) {
        this.winPercent = gamesWon * 100 / gamesTotal;
        this.lossPercent = gamesLost * 100 / gamesTotal;
    }
}
