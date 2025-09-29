package org.example;

import java.util.Scanner;

public class Main {
    private static void exercise1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write something: ");
        String input = scanner.nextLine();

        System.out.println("You wrote: <" + input + ">");
    }

    private static void exercise2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write something: ");
        String input = scanner.nextLine();

        System.out.println("You wrote: " + input +
                " and it has " + input.length() + " characters");
    }

    private static void exercise3() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write something: ");
        String input = scanner.nextLine();

        //StringBuilder is better for concatenation
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(input.charAt(i));
            if (i < input.length() - 1) {
                result.append("@");
            }
        }

        System.out.println(result.toString());
    }

    private static void exercise4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write something: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder();
        reversed.reverse();

        System.out.println("Reversed: " + reversed.toString());
    }

    private static void exercise5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write something: ");
        String input = scanner.nextLine();

        String morse = MorseConverter.textToMorse(input);
        System.out.println(morse);
    }

    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
        //exercise5();
    }
}