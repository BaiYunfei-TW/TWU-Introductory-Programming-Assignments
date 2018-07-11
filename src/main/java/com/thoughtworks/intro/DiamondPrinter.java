package com.thoughtworks.intro;

public class DiamondPrinter {


    private static final String NAME = "Bai Yunfei";

    public void printIsoscelesTriangle(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public void printDiamond(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < Math.abs(n - i - 1); j++) {
                System.out.print(" ");
            }
            if(i < n ){
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            }else {
                for (int j = 0; j < 4 * n - 2 * i - 3; j++) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

    public void printDiamondWithName(int n) {
        for (int i = 0; i < 2 * n - 1; i++) {
            for (int j = 0; j < Math.abs(n - i - 1); j++) {
                System.out.print(" ");
            }
            if(i < n - 1 ){
                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }
            }else if(i == n - 1){
                System.out.print(NAME);
            } else {
                for (int j = 0; j < 4 * n - 2 * i - 3; j++) {
                    System.out.print("*");
                }
            }
            System.out.print("\n");
        }
    }

    public void printFizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                System.out.print("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}
