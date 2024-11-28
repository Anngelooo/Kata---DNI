package dev.exercise;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import view.DniView;

public class DniViewTest {

    private ByteArrayInputStream testInput;
    private ByteArrayOutputStream testOutput;
    private DniView view;

    @BeforeEach
    public void setUp() {
        testOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(testOutput));
        view = new DniView();
    }

    @AfterEach
    public void tearDown() {
        System.setIn(System.in);
        System.setOut(System.out);
    }

    @Test
    public void testDisplayDniLetter() {
        view.displayDniLetter('A');
        assertTrue(testOutput.toString().contains("The letter corresponding to your DNI is: A"));
    }

    @Test
    public void testDisplayError() {
        view.displayError("Test error message");
        assertTrue(testOutput.toString().contains("Test error message"));
    }
}
