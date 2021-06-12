/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonas Turner
 */

/*
Exercise 29 - Handling Bad Input
The rule of 72 is a quick method for estimating how long it will take to double your investment, by taking
the number 72 and dividing it by the expected rate of return. It’s a good tool that helps you figure out if
the stock, bond, or savings account is right for you. It’s also a good program to write to test for and prevent
bad input because computers can’t divide by zero. And instead of exiting the program when the user enters invalid
input, you can just keep prompting for inputs until you get one that’s valid.

Write a quick calculator that prompts for the rate of return on an investment and calculates how many years it
will take to double your investment.

The formula is

    years = 72 / r

where r is the stated rate of return.

Example Output

What is the rate of return? 0
Sorry. That's not a valid input.
What is the rate of return? ABC
Sorry. That's not a valid input.
What is the rate of return? 4
It will take 18 years to double your initial investment.

Constraints

Don’t allow the user to enter 0.
Don’t allow non-numeric values.
Use a loop to trap bad input, so you can ensure that the user enters valid values.

Challenge

Display a different error message when the user enters 0.
 */
package assignment2.ex29.base;


import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

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
                    System.out.println("Sorry. That's not a valid input.");
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
