package com.thoughtworks.intro;

public class TrianglePrinter {

    /**
     * Print one asterisk to the console.
     */
    public void printOneAsterisk() {
        System.out.print("*");
    }

    public void printHorizontalLine(int n) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < n; i++) {
            sb.append("*");
        }
        System.out.print(sb.toString());
    }

    public void printVerticalLine(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("*\n");
        }
    }

    public void printRightTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
