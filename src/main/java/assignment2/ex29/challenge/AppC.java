package assignment2.ex29.challenge;

import java.util.Scanner;

public class AppC {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        AppC app = new AppC();

        int input = app.getInput();
        String out = app.createOut(app.doMath(input));
        app.printOut(out);
    }

    public int getInput(){
        System.out.println("What is the rate of return?");
        String input = in.nextLine();
        int num;

        // catches letters
        while(true) {
            try {
                num = Integer.parseInt(input);

                // catches 0
                while(num == 0){
                    System.out.println("Sorry. Cannot divide by zero.");
                    System.out.println("What is the rate of return?");
                    num = Integer.parseInt(in.nextLine());
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input.");
                System.out.println("What is the rate of return?");
                input = in.nextLine();
            }
        }
        return num;
    }

    public int doMath(int input){
        // casted to doubles to avoid integer division nonsense
        return (int)Math.ceil(72.0 / (double) input);
    }

    public String createOut(int result){
        return "It will take " + result + " years to double your initial investment.";
    }

    public void printOut(String out){
        System.out.println(out);
    }
}

