package day3;
import java.util.Scanner;

public class SumOneToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum from 1 to " + n + " is: " + sum);

        scanner.close();
    }
}