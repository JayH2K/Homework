package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CombinerTest {
    @Test
    void shouldCombineTwoObjects() {
        var combiner = new Combiner<>();
        assertEquals("First item: -77; Second item: 19.8", combiner.combineTwoItems(-77, 19.8));
    }
}