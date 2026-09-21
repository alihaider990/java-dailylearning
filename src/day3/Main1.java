package day3;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.print("enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("enter an operator (+,-,*,/,): ");
        operator = scanner.next().charAt(0);

        System.out.print("enter the second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.print("cannot divide by zero");
                    validOperator = false;
                } else {
                    result = num1 / num2;
                }
            }
            case '*' -> result = num1 * num2;
            default -> {
                System.out.print("invalid operator!");
                validOperator = false;
            }
        }

        if (validOperator) {
            System.out.print(result);
        }

        scanner.close();
    }
}