package com.thoughtworks.intro;

import org.junit.*;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestTrianglePrinter {

    private TrianglePrinter printer;

    private final ByteArrayOutputStream consoleStream = new ByteArrayOutputStream();

    @Before
    public void init() {
        this.printer = new TrianglePrinter();
        System.setOut(new PrintStream(consoleStream));
    }

    private String getConsoleOutput() {
        return consoleStream.toString();
    }

    /**
     * Test print one asterisk to the console.
     */
    @Test
    public void test_print_one_asterisk_to_the_console() {
        String expected = "*";

        printer.printOneAsterisk();

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    /**
     * Draw a horizontal line with 6 asterisks
     */
    @Test
    public void test_draw_a_horizontal_line_with_6_asterisks_while_given_6() {
        String expected = "******";

        printer.printHorizontalLine(6);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    /**
     * Draw a horizontal line with 8 asterisks
     */
    @Test
    public void test_draw_a_horizontal_line_with_8_asterisks_while_given_8() {
        String expected = "********";

        printer.printHorizontalLine(8);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    /**
     * Draw a vertical line with 3 asterisks
     */
    @Test
    public void test_draw_a_vertical_line_with_3_asterisks_while_given_3() {
        String expected =   "*\n" +
                "*\n" +
                "*\n";

        printer.printVerticalLine(3);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    /**
     * Draw a vertical line with 5 asterisks
     */
    @Test
    public void test_draw_a_vertical_line_with_5_asterisks_while_given_5() {
        String expected =   "*\n" +
                "*\n" +
                "*\n" +
                "*\n" +
                "*\n";

        printer.printVerticalLine(5);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    /**
     * Draw a right triangle with 3 floors
     */
    @Test
    public void test_draw_a_right_triangle_with_3_floors_while_given_3() {
        String expected = "*\n" +
                "**\n" +
                "***\n";

        printer.printRightTriangle(3);

        assertThat(getConsoleOutput(), equalTo(expected));
    }

    /**
     * Draw a right triangle with 3 floors
     */
    @Test
    public void test_draw_a_right_triangle_with_4_floors_while_given_4() {
        String expected = "*\n" +
                "**\n" +
                "***\n" +
                "****\n";

        printer.printRightTriangle(4);

        assertThat(getConsoleOutput(), equalTo(expected));
    }
}
