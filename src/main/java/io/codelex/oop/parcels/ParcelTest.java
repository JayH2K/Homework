package io.codelex.oop.parcels;

public class ParcelTest {
    public static void main(String[] args) {
        Parcel ID123 = new Parcel(12, 10, 20, 18);
        Parcel ID345 = new Parcel(-2, 0, 5, 0);
        Parcel ID678 = new Parcel(31, 30, 19, 20);
        Parcel ID912 = new Parcel(10, 15, 29, 10);

        System.out.println("Package 1 is valid: " + ID123.validate() + ". Package is epress: " + ID123.isExpress);
        System.out.println("Package 2 is valid: " + ID345.validate() + ". Package is epress: " + ID345.isExpress);
        System.out.println("Package 3 is valid: " + ID678.validate() + ". Package is epress: " + ID678.isExpress);
        System.out.println("Package 4 is valid: " + ID912.validate() + ". Package is epress: " + ID912.isExpress);
    }
}
