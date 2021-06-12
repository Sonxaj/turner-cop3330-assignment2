/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonas Turner
 */

/*
Exercise 31 - Karvonen Heart Rate
When you loop, you can control how much you increment the counter; you don’t always have to increment by one.

When getting into a fitness program, you may want to figure out your target heart rate so you don’t overexert
yourself. The Karvonen heart rate formula is one method you can use to determine your rate.
Create a program that prompts for your age and your resting heart rate. Use the Karvonen formula to determine
the target heart rate based on a range of intensities from 55% to 95%. Generate a table with the results as
shown in the example output. The formula is

    TargetHeartRate = (((220 − age) − restingHR) × intensity) + restingHR

Example Output

Resting Pulse: 65        Age: 22

Intensity    | Rate
-------------|--------
55%          | 138 bpm
60%          | 145 bpm
65%          | 151 bpm
:               :        (extra lines omitted)
85%          | 178 bpm
90%          | 185 bpm
95%          | 191 bpm

Constraints

Don’t hard-code the percentages. Use a loop to increment the percentages from 55 to 95.
Ensure that the heart rate and age are entered as numbers. Don’t allow the user to continue without entering
valid inputs.
Display the results in a tabular format.

Challenge
Implement this as a GUI program that allows the user to use a slider control for the intensity, and update the interface in real time as the slider moves.
 */

package assignment2.ex31;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        String[][] table = new String[11][2];

        int restingHR = app.getInput(1);
        int age = app.getInput(2);

        app.genTable(table, restingHR, age);
        app.printTable(table);
    }

    public int getInput(int text){
        switch (text){
            case 1 -> System.out.println("Resting Pulse: ");
            case 2 -> System.out.println("Age: ");
        }
        String input = in.nextLine();
        int num;

        while(true) {
            try {
                num = Integer.parseInt(input);
                break;

                // catches letters
            } catch (NumberFormatException e) {
                System.out.println("Sorry. That's not a valid input. Please input again: ");
                input = in.nextLine();
            }
        }
        return num;
    }

    public void genTable(String[][] table, int restingHR, int age){
        double intensity = 0.55;
        int intensityAsInt = 55; // for display

        // insert the text first
        table[0][0] = "Intensity";
        table[0][1] = "Rate";
        table[1][0] = "-------------";
        table[1][1] = "--------";

        // now put em in
        for (int i=2; i<11; i++) {

            table[i][0] = intensityAsInt + "%";

            table[i][1] =
                    Math.round((((220 - age) - restingHR) * intensity) + restingHR)
                    + " bpm";

            intensity += 0.05;
            intensityAsInt += 5;
        }
    }

    public void printTable(String[][] table){
        // header
        System.out.printf("%-13s%-2s%-21s\n", table[0][0], "|", table[0][1]);

        // lines
        System.out.printf("%-13s%s%-21s\n", table[1][0], "|", table[1][1]);

        // data
        for(int i=2; i<11; i++){
            System.out.printf("%-13s%-2s%-21s\n", table[i][0], "|", table[i][1]);
        }
    }
}
