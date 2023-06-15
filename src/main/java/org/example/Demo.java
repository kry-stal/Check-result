package org.example;

import java.util.Scanner;

public class Demo {

    public static void checkResultUsingIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER SCORE: ");
        double score = scanner.nextDouble();
        if (score < 0 || score > 100) {
            System.out.println("Invalid Score");
        } else if (score <= 25) {
            System.out.println("F");
        } else if (score <= 35) {
            System.out.println("E");
        } else if (score <= 45) {
            System.out.println("D");
        } else if (score <= 55) {
            System.out.println("C");
        } else if (score <= 75) {
            System.out.println("B");
        } else if (score <= 100) {
            System.out.println("A");
        } else {
            System.out.println("Invalid Score");
        }
    }

    public static void checkResultUsingSwitch() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER SCORE: ");
        int score = scanner.nextInt();
        }



    public static void main(String[] args) {
        checkResultUsingIf();
    }

}



