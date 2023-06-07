package io.codelex.enums.exercise1;

import java.lang.reflect.Array;

public class CompassTest {
    public static void main(String[] args) {
        Compass north = Compass.NORTH;
        Compass south = Compass.SOUTH;
        Compass east = Compass.EAST;
        Compass west = Compass.WEST;

        System.out.println("--------------------");
        System.out.println("| Direction | Text |");
        System.out.println("--------------------");

        Compass[] directionArray = new Compass[]{north, south, east, west};

        for (Compass i : directionArray
        ) {
            switch (i) {
                case NORTH -> System.out.println("|   " + north.getName() + "   | " + north.getDirection() + "   |");
                case SOUTH -> System.out.println("|   " + south.getName() + "   | " + south.getDirection() + " |");
                case EAST -> System.out.println("|   " + east.getName() + "    | " + east.getDirection() + "|");
                case WEST -> System.out.println("|   " + west.getName() + "    | " + west.getDirection() + " |");
            }
        }
        System.out.println("--------------------");
        for (Compass i : directionArray
        ) {
            if (i.equals(Compass.NORTH)) {
                System.out.println(north.getName() + ":" + north.getDirection() + ":" + north.getNum());
            }
            if (i.equals(Compass.SOUTH)) {
                System.out.println(south.getName() + ":" + south.getDirection() + ":" + south.getNum());
            }
            if (i.equals(Compass.EAST)) {
                System.out.println(east.getName() + ":" + east.getDirection() + ":" + east.getNum());
            }
            if (i.equals(Compass.WEST)) {
                System.out.println(west.getName() + ":" + west.getDirection() + ":" + west.getNum());
            }
        }
    }
}
