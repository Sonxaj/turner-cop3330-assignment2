/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonas Turner
 */

/*
Exercise 35 - Picking a Winner
Arrays don’t have to be hard-coded. You can take user input and store it in an array and then work with it.

Create a program that picks a winner for a contest or prize drawing. Prompt for names of contestants until the user
 leaves the entry blank. Then randomly select a winner.

Example Output

Enter a name: Homer
Enter a name: Bart
Enter a name: Maggie
Enter a name: Lisa
Enter a name: Moe
Enter a name:
The winner is... Maggie.

Constraints

Use a loop to capture user input into an array.
Use a random number generator to pluck a value from the array.
Don’t include a blank entry in the array.
Some languages require that you define the length of the array ahead of time. You may need to find another data
structure, like an ArrayList.

Challenges

When a winner is chosen, remove the winner from the list of contestants and allow more winners to be chosen.
Make a GUI program that shows the array of names being shuffled on the screen before a winner is chosen.
Create a separate contest registration application. Use this program to pull in all registered users and pick a winner.
 */

package assignment2.ex35.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        List<String> names = new ArrayList<>();

        app.enterNames(names);

        app.getWinner(names);
    }

    public void enterNames(List<String> names){
        String input = "Empty";

        // stop on a blank input
        while(!(input.equalsIgnoreCase(""))){
            System.out.println("Enter a name:");
            input = in.nextLine();

            if(!(input.equalsIgnoreCase(""))){
                names.add(input);
            }
        }
    }

    public void getWinner(List<String> names){
        String out = "The winner is... ";

        out += names.get(randNum(names));

        System.out.println(out);
    }

    public int randNum(List<String> names){
        Random r = new Random();
        return r.nextInt(names.size());
    }
}
