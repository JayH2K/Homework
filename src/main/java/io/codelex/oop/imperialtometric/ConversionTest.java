package io.codelex.oop.imperialtometric;

public class ConversionTest {
    public static void main(String[] args) {
        MeasurementConverter conv = new MeasurementConverter();

        System.out.println(conv.convert(1, ConversionType.METERS_TO_YARDS));
        System.out.println(conv.convert(1, ConversionType.YARDS_TO_METERS));
        System.out.println(conv.convert(1, ConversionType.KILOMETERS_TO_MILES));
        System.out.println(conv.convert(1, ConversionType.MILES_TO_KILOMETERS));
        System.out.println(conv.convert(1, ConversionType.CENTIMETERS_TO_INCHES));
        System.out.println(conv.convert(1, ConversionType.INCHES_TO_CENTIMETERS));
    }
}
