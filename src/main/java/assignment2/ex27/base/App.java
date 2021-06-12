package assignment2.ex27.base;

import java.util.Scanner;

public class App {
    Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App app = new App();
        InputValidator validator = new InputValidator();

        String firstName = app.getInput(1);
        String lastName = app.getInput(2);
        String zipCode = app.getInput(3);
        String id = app.getInput(4);

        String out = validator.generateResultString(validator.validateInput(firstName, 1), "first");
        out += validator.generateResultString(validator.validateInput(lastName, 1), "last");
        out += validator.generateResultString(validator.validateInput(zipCode, 2), "");
        out += validator.generateResultString(validator.validateInput(id, 3),"" );

        app.printOut(out);
    }

    private void printOut(String out) {
        System.out.println(out);
    }

    public String getInput(int text){
        switch (text){
            case 1 -> System.out.println("Enter the first name:");
            case 2 -> System.out.println("Enter the last name:");
            case 3 -> System.out.println("Enter the ZIP code:");
            case 4 -> System.out.println("Enter the employee ID:");
        }
        return in.nextLine();
    }
}
