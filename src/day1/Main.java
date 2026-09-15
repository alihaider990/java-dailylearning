package day1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       Scanner scanner= new Scanner(System.in);


        String adjective1="";
        String noun1 = "";
        String adjective2="";
        String verb1="";
        String adjective3="";

      IO.println("enter an adjective(description): ");
      adjective1 = scanner.nextLine();
       IO.println( "enter a noun (animal or person): ");
       noun1 = scanner.nextLine();
        IO.println( "enter an adjective(description): ");
        adjective2 = scanner.nextLine();
        IO.println( "enter a verb end with -ing (action)");
        verb1 = scanner.nextLine();
        IO.println( "enter an adjective (description)");
        adjective3= scanner.nextLine();




        IO.println("\nToday i went to a " + adjective1 + "zoo.");
        IO.println("in an exhibit, i saw a " + noun1 + ".");
        IO.println("noun1" + "was" + adjective2 + "and" + verb1 +"!");
        IO.println("i was" + adjective3 + "!");


        scanner.close();


    }
}
