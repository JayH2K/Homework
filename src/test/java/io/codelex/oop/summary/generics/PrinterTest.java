package io.codelex.oop.summary.generics;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PrinterTest {

    @Test
    void shouldPrintObject() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        var printer = new Printer<LocalDate>(LocalDate.of(2012, 1, 1));
        printer.print();
        String expectedOutput = "2012-01-01\r\n";
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    void shouldGetThingToPrint() {
        var printer = new Printer<LocalDate>(LocalDate.of(2012, 1, 1));
        assertEquals(LocalDate.of(2012, 1, 1), printer.getThingToPrint());
    }
}