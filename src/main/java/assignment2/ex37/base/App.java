/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Jonas Turner
 */

/*
Exercise 37 - Password Generator
Coming up with a password that meets specific requirements is something your computer can do. And it will give
you practice using random number generators in conjunction with a list of known values.

Create a program that generates a secure password. Prompt the user for the minimum length, the number of special
characters, and the number of numbers. Then generate a password for the user using those inputs.

Example Output

What's the minimum length? 8
How many special characters? 2
How many numbers? 2
Your password is aurn2$1s#

Constraints

Use lists to store the characters you’ll use to generate the passwords.
Ensure that the generated password is random.
Ensure that there are at least as many letters are there are special characters and number.

Challenges

Randomly convert vowels to numbers, such as 3 for E and 4 for A.
Have the program present a few options rather than a single result.
Place the password on the user’s clipboard when generated.
 */

package assignment2.ex37.base;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        PasswordGenerator passwordGenerator = new PasswordGenerator();

        String password = "";

        int length = app.getInput(1);
        int special = app.getInput(2);
        int num = app.getInput(3);


        password += passwordGenerator.addSpecial(special);
        password += passwordGenerator.addNumbers(num);
        password += passwordGenerator.addLetters(length+special+num);

        passwordGenerator.displayPass(password);
    }

    public int getInput(int text){
        switch (text){
            default-> System.out.println("What's the minimum length?");
            case 2 -> System.out.println("How many special characters?");
            case 3 -> System.out.println("How many numbers?");
        }
        return in.nextInt();
    }
}
