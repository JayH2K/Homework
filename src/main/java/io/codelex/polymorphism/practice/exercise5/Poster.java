package io.codelex.polymorphism.practice.exercise5;

public class Poster extends Advert {
    int heightCM;
    int widthCM;

    private final double areaRate = 0.02; //per square cm over A2 format

    int count;


    public Poster(int fee, int heightCM, int widthCM, int count) {
        super(fee);
        this.heightCM = heightCM;
        this.widthCM = widthCM;
        this.count = count;
    }

    public double calculateAreaFee() {
        int area = this.heightCM * this.widthCM;
        int areaFee = 0;
        if (area > 2500) {
            areaFee += (area - 2500) * this.areaRate;
        }
        return areaFee;
    }

    @Override
    public int cost() {

        return super.cost() + (int) calculateAreaFee() * count;
    }

    public String toString() {
        return super.toString()
                + " Poster: Height: " + this.heightCM +
                "CM. Width: " + this.widthCM +
                "CM. Count: " + this.count +
                ". Extra Area fee: " + calculateAreaFee();
    }
}
