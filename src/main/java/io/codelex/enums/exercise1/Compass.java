package io.codelex.enums.exercise1;

public enum Compass {

    NORTH("North", "Up", 0),
    EAST("East", "Right", 2),
    SOUTH("South", "Down", 1),
    WEST("West", "Left", 3);

    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public String getDirection() {
        return direction;
    }

    private final String name;
    private final String direction;
    private final int num;

    Compass(String name, String direction, int num) {
        this.name = name;
        this.direction = direction;
        this.num = num;
    }

}
