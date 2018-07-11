package com.thoughtworks.intro;

import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.CoreMatchers.*;

public class TestFizzBuzz {

    private DiamondPrinter printer;

    private final ByteArrayOutputStream consoleStream = new ByteArrayOutputStream();

    @Before
    public void init() {
        this.printer = new DiamondPrinter();
        System.setOut(new PrintStream(consoleStream));
    }

    private String getConsoleOutput() {
        return consoleStream.toString();
    }

    @Test
    public void test_print_result_when_given_15() {
        String excepted = "1\n" +
                "2\n" +
                "Fizz\n" +
                "4\n" +
                "Buzz\n" +
                "Fizz\n" +
                "7\n" +
                "8\n" +
                "Fizz\n" +
                "Buzz\n" +
                "11\n" +
                "Fizz\n" +
                "13\n" +
                "14\n" +
                "FizzBuzz\n";

        printer.printFizzBuzz(15);

        assertThat(getConsoleOutput(), equalTo(excepted));
    }

}
