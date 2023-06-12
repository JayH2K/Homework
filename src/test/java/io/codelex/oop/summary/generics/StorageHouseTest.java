package io.codelex.oop.summary.generics;

import io.codelex.polymorphism.practice.exercise1.Audi;
import io.codelex.polymorphism.practice.exercise1.Lexus;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class StorageHouseTest {
    @Test
    void shouldBeAbleToAddObject() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        var storage = new StorageHouse<>("X");
        storage.addMoreItems("Y");
        storage.printItems();
        String expectedOutput = "X\r\nY\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void shouldGetOptionalFirstItem() {
        var storage = new StorageHouse<>("X");
        assertTrue(storage.getMaybeFirstItem().isPresent());
        assertEquals("X", storage.getMaybeFirstItem().get());
    }
}