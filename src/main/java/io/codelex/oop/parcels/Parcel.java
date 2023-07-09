package io.codelex.oop.parcels;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Parcel implements Validable {
    private final int xLength;
    private final int yLength;

    private final int zLength;
    private final float weight;
    boolean isExpress;

    @Override
    public String toString() {
        return this.getClass().getName();
    }

    @Override
    public boolean validate() {

        boolean validated = true;
        if (this.xLength + this.yLength + this.weight > 300) {
            validated = false;
        }
        if (this.xLength > 30 || this.yLength > 30 || this.zLength > 30) {
            validated = false;
        }
        try {
            int[] test = new int[this.xLength - 1];
            int[] test2 = new int[this.yLength - 1];
            int[] test3 = new int[this.zLength - 1];
            int[] test4 = new int[(int) this.weight - 1];
        } catch (NegativeArraySizeException e) {
            System.out.println("No non-positive parameters allowed!");
            validated = false;
        }
        this.isExpress = this.weight <= 15;
        return validated;
    }

    public Parcel(int xLength, int yLength, int zLength, float weight) {
        this.xLength = xLength;
        this.yLength = yLength;
        this.zLength = zLength;
        this.weight = weight;
    }
}
