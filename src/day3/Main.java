package day3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double temp = 20;
        boolean isSunny = true;

        if(temp <= 30 && temp >= 0 && isSunny){
            System.out.print("the weather is so good\n ");
            System.out.print("it is sunny outside");

        }
        else if(temp <= 30 && temp >= 0 && !isSunny){
            System.out.print("the weather is so good\n ");
            System.out.print("it is sunny outside");
        }

    }


}
