package org.example;

import java.util.Scanner;

public class Main {
    public static void exercise1() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write something: ");
        String input = scanner.nextLine();

        System.out.println("You wrote: <" + input + ">");
    }

    public static void exercise2() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write something: ");
        String input = scanner.nextLine();

        System.out.println("You wrote: " + input +
                " and it has " + input.length() + " characters");
    }

    public static void exercise3() {
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

    public static void exercise4() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write something: ");
        String input = scanner.nextLine();

        StringBuilder reversed = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }

        System.out.println("Reversed: " + reversed.toString());
    }

    public static void main(String[] args) {
        //exercise1();
        //exercise2();
        //exercise3();
        //exercise4();
    }
}