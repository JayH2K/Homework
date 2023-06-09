package io.codelex.arithmetic.practice;

import java.math.BigDecimal;

class Geometry {
    static BigDecimal areaOfCircle(BigDecimal radius) {
        return ((radius.multiply(radius)).multiply(BigDecimal.valueOf(3.14159265359)));
    }

    static BigDecimal areaOfRectangle(BigDecimal length, BigDecimal width) {
        return width.multiply(length);
    }

    static BigDecimal areaOfTriangle(BigDecimal base, BigDecimal h) {
        return base.multiply(h).multiply(BigDecimal.valueOf(0.5));
    }
}
