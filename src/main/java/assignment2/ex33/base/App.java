/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonas Turner
 */

/*
Exercise 33 - Magic 8 Ball
Arrays are great for storing possible responses from a program. If you combine that with a random number generator,
you can pick a random entry from this list, which works great for games.

Create a Magic 8 Ball game that prompts for a question and then displays either "Yes," "No," "Maybe," or
"Ask again later."

Example Output

What's your question?
> Will I be rich and famous?

Ask again later.

Constraint

The value should be chosen randomly using a pseudo random number generator. Store the possible choices in a
list and select one at random.

Challenges

Implement this as a GUI application.
If available, use native device libraries to allow you to “shake” the 8 ball.
*/

package assignment2.ex33.base;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();

        // list of responses
        List<String> responses = new ArrayList<>();
        app.initializeList(responses);

        // 8 ball
        app.ask();
        String out = app.response(responses);
        app.printOut(out);
    }

    public void initializeList(List<String> responses){
        responses.add("Ask again later.");
        responses.add("Yes.");
        responses.add("No.");
        responses.add("Maybe.");
    }

    private void printOut(String out) {
        System.out.println(out);
    }

    public int randNum(){
        Random r = new Random();
        return r.nextInt(4);
    }

    public void ask(){
        System.out.println("What's your question?");
        in.nextLine();
    }

    public String response(List<String> responses){
        String out = "\n";
        int choice = randNum();
        switch (choice){
            default-> out += responses.get(0);
            case 2 -> out += responses.get(1);
            case 3 -> out += responses.get(2);
            case 4 -> out += responses.get(3);
        }
        return out;
    }
}
