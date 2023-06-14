package io.codelex.AdvancedJavaTest.exercise3;

public class Joiner<T> {

    String seperator;

    public Joiner(String seperator) {
        this.seperator = seperator;
    }

    public String join(T... X) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < X.length; i++) {
            stringBuilder.append(X[i]);

            if (i < X.length - 1) {
                stringBuilder.append(seperator);
            }
        }

        return stringBuilder.toString();
    }
}
