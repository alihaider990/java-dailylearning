package day6;
import java.util.Scanner;

public class Main5 {
    public static void main(String [] args){
        String[] questions ={"what is the engine size of c63?",
                "how many horsepower does a m5 produces?",
                "how many nm of torque a supra produces?",
                "what is the engine size of nissan r35?",
                "which engine does a land cruiser have?"};

        String[][] options ={{"1.  6.2 liter", "2. 6.9 liter","3. 9.8 liter","4. 5.2 liter"},
                             {"1. 567", "2. 456", "3.  546","4. 789"},
                             {"1. 567", "2. 456", "3.  546","4. 789"},
                             {"1.  6.2 liter", "2. 6.9 liter","3. 9.8 liter","4. 5.2 liter"},
                             {"1.  6.2 liter", "2. 6.9 liter","3. 9.8 liter","4. 5.2 liter"}};

        int[] answer = {3,1,3,3,4};

        int score =0;
        int guess;

        Scanner scanner = new Scanner(System.in);
        System.out.println("*****************************");
        System.out.println("Welcome to the java quiz game");
        System.out.println("*****************************");

        for(int i =0;i < questions.length; i++) {
            System.out.println(questions[i]);


            for (String option : options[i]) {
                System.out.println(option);
            }
            System.out.print("enter your guess: ");
            guess = scanner.nextInt();

            if(guess == answer[i]){
                System.out.println("********");
                System.out.println("!CORRECT");
                System.out.println("********");
            }
            else {
                System.out.println("******");
                System.out.println("!WRONG");
                System.out.println("******");
            }
        }

        System.out.println("your final score is: " + score + "out of" + questions.length);


scanner.close();
    }
}
