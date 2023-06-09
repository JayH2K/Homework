package io.codelex.polymorphism.practice.exercise2;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

public class MakeSounds {
    public static void main(String[] arg) {
        List<Object> list = new ArrayList<>();
        Parrot iago = new Parrot();
        list.add(iago);
        Parrot zazu = new Parrot();
        list.add(zazu);
        Radio panasonic = new Radio();
        list.add(panasonic);
        Radio rca = new Radio();
        list.add(rca);
        Firework skyrocket = new Firework();
        list.add(skyrocket);
        Firework singleShotAreal = new Firework();
        list.add(singleShotAreal);
        for (Object o : list
        ) {
            try {
                o.getClass().getMethod("playSound").invoke(o);
            } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException a) {
                throw new RuntimeException(a);
            }
        }
    }
}
