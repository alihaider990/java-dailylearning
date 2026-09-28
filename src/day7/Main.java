package day7;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"rock", "paper", "scissors"};

        String playerChoice;
        String computerChoice;
        String playAgain ="yes";

        do {


            System.out.print("enter your move (rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scrssors")) {
                System.out.println("invalid choice");
                continue;


            }

            computerChoice = choices[random.nextInt(3)];
            System.out.println("computer choice: " + computerChoice);

            if (playerChoice.equals(computerChoice)) {
                System.out.println("Its a tie");
            } else if ((playerChoice.equals("rock") && computerChoice.equals("scissors")) || (playerChoice.equals("paper") && computerChoice.equals("rock")) || (playerChoice.equals("scissors") && computerChoice.equals("paper"))) {
                System.out.println("you win!");
            } else {
                System.out.println("you lose!");
            }

            System.out.println("play again (yes/no");
            playAgain = scanner.nextLine().toLowerCase();


        }  while(playAgain.equals("yes"));


        scanner.close();
    }
}
