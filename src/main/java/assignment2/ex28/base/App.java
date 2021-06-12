/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonas Turner
 */

/*
Exercise 28 - Adding Numbers
In previous programs, you asked the user for repeated input by writing the input statements multiple times.
But it’s more efficient to use loops to deal with repeated input.

Write a program that prompts the user for five numbers and computes the total of the numbers.

Example Output

Enter a number: 1
Enter a number: 2
Enter a number: 3
Enter a number: 4
Enter a number: 5
The total is 15.

Constraints

The prompting must use repetition, such as a counted loop, not three separate prompts.
Create a flowchart before writing the program.

Challenges

Modify the program to prompt for how many numbers to add, instead of hard-coding the value. Be sure you
convert the input to a number before doing the comparison.
Modify the program so that it only adds numbers and silently rejects non-numeric values. Count these invalid
entries as attempts anyway. In other words, if the number of numbers to add is 5, your program should still
prompt only five times.
 */

package assignment2.ex28.base;

import java.util.Scanner;
import java.util.ArrayList;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        ArrayList<Integer> inputs = new ArrayList<>();

        for(int i = 0; i<5; i++){
            System.out.println("Enter a number: ");
            app.getInput(in.nextInt(), inputs);
        }

        app.printOut(app.genOut(app.sum(inputs)));
    }

    public void getInput(int input, ArrayList<Integer> inputs){
        inputs.add(input);
    }

    // this can actually be tested
    public int sum(ArrayList<Integer> inputs){
        int sum = 0;
        for (int i: inputs) {
            sum += i;
        }
        return sum;
    }

    public String genOut (int sum){
        return "The total is " + sum + ".";
    }

    public void printOut(String out){
        System.out.println(out);
    }
}
