package io.codelex.enums.exercise2;

public enum RPS {

    ROCK(null, "ROCK"),
    PAPER(null, "PAPER"),
    SCISSORS(null, "SCISSORS");

    RPS beats;
    final String name;

    RPS(RPS beats, String name) {
        this.beats = beats;
        this.name = name;
    }

    static {
        ROCK.beats = SCISSORS;
        PAPER.beats = ROCK;
        SCISSORS.beats = PAPER;
    }
}
