package day4;

public class EvenNumbersBreak {
    public static void main(String[] args) {
        for (int i = 1; i <= 50; i++) {
            if (i % 40 == 0) {
                break;
            }
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}