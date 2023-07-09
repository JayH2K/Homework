package io.codelex.oop.runners;

public enum Runner {
    BEGINNER(60, Double.POSITIVE_INFINITY),
    INTERMEDIATE(45, 60),
    ADVANCED(Double.NEGATIVE_INFINITY, 45);

    final double minRunMinutes;
    final double maxRunMinutes;

    Runner(double minRunMinutes, double maxRunMinutes) {
        this.minRunMinutes = minRunMinutes;
        this.maxRunMinutes = maxRunMinutes;
    }

    public static Runner getFitnesLevel(int resultMinutes) {
        Runner result = null;
        if (resultMinutes < ADVANCED.maxRunMinutes) {
            result = Runner.ADVANCED;
        } else if (resultMinutes > INTERMEDIATE.minRunMinutes && resultMinutes < INTERMEDIATE.maxRunMinutes) {
            result = Runner.INTERMEDIATE;
        } else if (resultMinutes > BEGINNER.minRunMinutes && resultMinutes < BEGINNER.maxRunMinutes) {
            result = Runner.BEGINNER;
        }
        return result;
    }
}
