package assignment2.ex28;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        for(int i = 0; i<5; i++){
            System.out.println("Enter a number: ");
            sum += in.nextInt();
        }
        System.out.println("The total is " + sum + ".");
    }
}
