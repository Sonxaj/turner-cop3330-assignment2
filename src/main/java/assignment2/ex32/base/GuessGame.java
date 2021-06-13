package assignment2.ex32.base;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {
    static Scanner in = new Scanner(System.in);

    public String askChoice(){
        System.out.println("\nDo you wish to play again (Y/N)?");
        return in.nextLine();
    }

    public void printOut(String out) {
        System.out.println(out);
    }

    public String genOut(int fails) {
        return "You got it in " + fails + " guesses!";
    }

    // random number generator
    public int randNum(int difficulty){
        Random r = new Random();
        int random = 0;
        switch (difficulty) {
            case 1 -> random = r.nextInt(10) + 1;
            case 2 -> random = r.nextInt(100) + 1;
            case 3 -> random = r.nextInt(1000) + 1;
        }
        return random;
    }

    public int guessGame() {
        int fails = 0; // to be returned

        // difficulty
        System.out.println("Enter the difficulty level (1, 2, or 3):");

        int difficulty = in.nextInt();

        int random = randNum(difficulty);

        System.out.println("I have my number. What's your guess?");

        in.nextLine(); // bug reasons

        String input = in.nextLine();

        int inputNum;

        // initial guess; also catches non-numeric inputs
        while (true) {
            try {
                inputNum = Integer.parseInt(input);
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input. Please input again: ");
                fails++;
                input = in.nextLine();
            }
        }

        // check the guess
        while (inputNum != random) {
            if (inputNum < random) {
                System.out.println("Too low.");
            } else {
                System.out.println("Too high");
            }
            fails++;
            System.out.println("Guess again");

            // next guess
            input = in.nextLine();
            while (true) {
                try {
                    inputNum = Integer.parseInt(input);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Sorry. That's not a valid input. Please input again: ");
                    fails++;
                    input = in.nextLine();
                }
            }
        }
        return fails;
    }
}