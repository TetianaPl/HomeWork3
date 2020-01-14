package com.epam.lesson3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int KATHET_LENGTH = 10;
        final char STAR = '*';
        int line;
        char value;
        Scanner input = new Scanner(System.in);

//      ********** TASK #1 **********
        System.out.println("********** TASK #1 **********");
        System.out.println();
        line = 1;
        while (line <= KATHET_LENGTH) {
            int row = 1;
            while (row <= line) {
                System.out.print(STAR + " ");
                row++;
            }
            System.out.println();
            line++;
        }
        line = KATHET_LENGTH - 1;
        while (line >= 1) {
            int row = line;
            while (row >= 1) {
                System.out.print(STAR + " ");
                row--;
            }
            System.out.println();
            line--;
        }
        System.out.println();

//      ********** TASK #2 **********
        System.out.print("ENTRY ANY SYMBOL TO CONTINUE");
        input.nextLine();
        System.out.println("********** TASK #2 **********");
        System.out.println();

        line = KATHET_LENGTH;
        while (line >= 1) {
            int row = KATHET_LENGTH;
            while (row >= 1) {
                value = row > line ? ' ' : STAR;
                System.out.print(value + " ");
                row--;
            }
            System.out.println();
            line--;
        }
        System.out.println();

//      ********** TASK #3 **********
        System.out.print("ENTRY ANY SYMBOL TO CONTINUE");
        input.nextLine();
        System.out.println("********** TASK #3 **********");
        System.out.println();
        line = 1;
        do {
            int row = KATHET_LENGTH;
            do {
                value = row > line ? ' ' : STAR;
                System.out.print(value + " ");
                row--;
            } while (row >= 1);
            System.out.println();
            line++;
        } while (line <= KATHET_LENGTH);

        System.out.println();

//      ********** TASK #4 **********
        System.out.print("ENTRY ANY SYMBOL TO CONTINUE");
        input.nextLine();
        System.out.println("********** TASK #4 **********");
        System.out.println();

        line = 1;
        while (line <= KATHET_LENGTH * 2 - 1) {
            int row = 1;
            while (row <= KATHET_LENGTH) {
                if (line > KATHET_LENGTH) {
                    value = line - KATHET_LENGTH >= row ? ' ' : STAR;
                } else {
                    value = KATHET_LENGTH - line >= row ? ' ' : STAR;
                }
                System.out.print(value + " ");
                row++;
            }
            System.out.println();
            line++;
        }
        System.out.println();

//      ********** TASK #5 **********
        System.out.print("ENTRY ANY SYMBOL TO CONTINUE");
        input.nextLine();
        System.out.println("********** TASK #5 **********");
        System.out.println();

        int iteration = 1;
        while (iteration <= 2) {
            line = 1;
            while (line <= KATHET_LENGTH) {
                int row = 1;
                while (row <= KATHET_LENGTH * 2 - 1) {
                    if (row > KATHET_LENGTH) {
                        value = row - KATHET_LENGTH >= line ? ' ' : STAR;
                    } else {
                        value = KATHET_LENGTH - row >= line ? ' ' : STAR;
                    }
                    System.out.print(value + " ");
                    row++;
                }
                System.out.println();
                line++;
            }
            iteration++;
        }

    }
}