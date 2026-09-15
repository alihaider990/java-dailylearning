package day1;

public class Main3 {

    public static void main(String[] args) {
        int a = 9;
        int b = 3;
        int c = 4;

        int max;

        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }

        System.out.println("Max is: " + max);
    }
}