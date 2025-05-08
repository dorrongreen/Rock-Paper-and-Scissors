import java.util.Scanner;

public class Game {
    /*
    Rules of the Game
    1.rock beats scissors
    2. paper beats rock
    3. scissors beats paper
     */

    public static void main(String[] args) {

        // we will take an input from the user - user choice
        // variables
        Scanner console = new Scanner(System.in);
        String userChoice;
        boolean exit = false;

        do {
            // variable for our validChoice
            boolean validChoice = false;
            // Get User Choice
            do {
                System.out.println("Please select your move [rock, paper, or scissors]:");
                userChoice = console.nextLine();
                if (userChoice.startsWith("rock") || userChoice.equalsIgnoreCase("paper") || userChoice.equalsIgnoreCase("scissors")) {
                    validChoice = true;
                } else {
                    System.out.println("Error: invalid choice");
                }
            } while (!validChoice); // the loop will run as long as validChoice remains false


            // randomly generate a choice - computer choice
            int random = (int) Math.floor(Math.random() * 3);
            String computerChoice = null;

            // compare the choices and determine a winner
            switch (random) {
                case 0:
                    computerChoice = "rock";
                    break;
                case 1:
                    computerChoice = "paper";
                    break;
                case 2:
                    computerChoice = "scissors";
                    break;
                default:// this will never happen
                    computerChoice = null;
            }
            System.out.println(computerChoice);
            // compare the choices and determine a winner

            String graphic = "L O A D I N G";
            for (int i = 0; i < graphic.length(); i++) {
                System.out.println(graphic.charAt(i));
            }

            if (computerChoice.equalsIgnoreCase(userChoice)) {
                System.out.printf("You both picked %s, it's a tie!%n", userChoice);
            } else if (computerChoice.equalsIgnoreCase("rock") && userChoice.equalsIgnoreCase("paper")) {
                System.out.printf("The computer picked %s and you picked %s - You win!! Yay!", computerChoice, userChoice);
            } else if (computerChoice.equalsIgnoreCase("paper") && userChoice.equalsIgnoreCase("scissors")) {
                System.out.printf("The computer picked %s and you picked %s - You win!! Yay!", computerChoice, userChoice);
            } else if (computerChoice.equalsIgnoreCase("scissors") && userChoice.equalsIgnoreCase("rock")) {
                System.out.printf("The computer picked %s and you picked %s - You win!! Yay!", computerChoice, userChoice);
            } else {
                System.out.printf("The computer picked %s and you picked %s - You Lose! :( It's ok better luck next time!", computerChoice, userChoice);
            }

            // Give the user a way to exit the game
            System.out.println("Would you like to play again? [y/n]: ");
            String playAgain = console.nextLine();

            if( playAgain.equalsIgnoreCase("n")){
                System.out.println("Thanks for playing! Goodbye!");
                exit = true;
            }else{
                exit = false;
            }


        } while (!exit);


    }// this closes the main method
    // grab the user choice
}// this closes the class
