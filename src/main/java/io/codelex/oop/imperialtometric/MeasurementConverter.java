package io.codelex.oop.imperialtometric;

public class MeasurementConverter {

    public double convert(int a, ConversionType conversionType) {
        double result = 0;
        switch (conversionType) {
            case METERS_TO_YARDS -> {
                result = a * 1.094;
            }
            case YARDS_TO_METERS -> {
                result = a / 1.094;
            }
            case KILOMETERS_TO_MILES -> {
                result = a / 1.609;
            }
            case MILES_TO_KILOMETERS -> {
                result = a * 1.609;
            }
            case CENTIMETERS_TO_INCHES -> {
                result = a / 2.54;
            }
            case INCHES_TO_CENTIMETERS -> {
                result = a * 2.54;
            }
        }
        return result;
    }
}
