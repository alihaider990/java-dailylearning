package day2;

import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        IO.println("enter any number");
        int number = scanner.nextInt();








                String result = (number % 2 == 0) ? "it is even" : "it is odd number";
                System.out.println(result);

                scanner.close();
            }
        }





