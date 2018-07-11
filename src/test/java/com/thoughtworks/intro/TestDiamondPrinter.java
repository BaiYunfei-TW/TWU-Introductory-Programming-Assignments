package com.thoughtworks.intro;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestDiamondPrinter {
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
    public void test_print_a_centered_triangle_when_given_3() {
        String expected =   "  *\n" +
                            " ***\n" +
                            "*****\n";
        printer.printIsoscelesTriangle(3);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    @Test
    public void test_print_a_centered_triangle_when_given_4() {
        String expected =   "   *\n" +
                            "  ***\n" +
                            " *****\n" +
                            "*******\n";
        printer.printIsoscelesTriangle(4);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    @Test
    public void test_print_a_centered_diamond_when_given_3() {
        String expected =   "  *\n" +
                            " ***\n" +
                            "*****\n" +
                            " ***\n" +
                            "  *\n";
        printer.printDiamond(3);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    @Test
    public void test_print_a_centered_diamond_when_given_4() {
        String expected =   "   *\n" +
                            "  ***\n" +
                            " *****\n" +
                            "*******\n" +
                            " *****\n" +
                            "  ***\n" +
                            "   *\n";
        printer.printDiamond(4);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    @Test
    public void test_print_a_centered_diamond_when_given_5() {
        String expected =   "    *\n" +
                            "   ***\n" +
                            "  *****\n" +
                            " *******\n" +
                            "*********\n" +
                            " *******\n" +
                            "  *****\n" +
                            "   ***\n" +
                            "    *\n";
        printer.printDiamond(5);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    @Test
    public void print_a_centered_diamond_with_name_when_given_3() {
        String expected =   "  *\n" +
                            " ***\n" +
                            "Bai Yunfei\n" +
                            " ***\n" +
                            "  *\n";
        printer.printDiamondWithName(3);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    @Test
    public void print_a_centered_diamond_with_name_when_given_4() {
        String expected =   "   *\n" +
                            "  ***\n" +
                            " *****\n" +
                            "Bai Yunfei\n" +
                            " *****\n" +
                            "  ***\n" +
                            "   *\n";
        printer.printDiamondWithName(4);

        assertThat(getConsoleOutput(), equalTo(expected));
    }
}
