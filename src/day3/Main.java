package day3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);




        String username;

        System.out.print("enter your username");
        username = scanner.nextLine();

        if(username.length() < 4 || username.length() > 12){
System.out.print("username must be   between 4-12 characters: ");
        }











        scanner.close();
    }


}
