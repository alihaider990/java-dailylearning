package day1;

import java.util.Scanner;

public class Main1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter any number: ");
        int num = scanner.nextInt();

        if (num % 2 == 0) {
            System.out.println("number is even");
        } else {
            System.out.println("number is odd");
        }

        scanner.close();
    }
}