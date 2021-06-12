package assignment2.ex27.base;

public class InputValidator {

    /*
        Each error message is categorized by the number.
        Name errors are between 1 and 3, zipcode is 4,
        and ID is 5. Depending on the number used, DisplayResult
        will return the appropriate message to be concatenated in main.
    */

    public int validateInput(String input, int choice){
        int out = 0;
        switch (choice){
            case 1 -> out += checkName(input);
            case 2 -> out += checkZipCode(input);
            case 3 -> out += checkID(input);
        }
        return out;
    }

    public int checkName(String input){
        int out = 0;

        char[] inputArr = input.toCharArray();

        // length is more than 2?
        if(!(input.length() >= 2)){
            out = 1;
        }

        // filled in?
        if(input.length() == 0){
            out += 2;
        }else{
            for(int i=0; i<(input.length()); i++){
                if(!(Character.isLetter(inputArr[i]))){
                    out += 2;
                    break;
                }
            }
        }
        return out;
    }

    public int checkZipCode(String input){
        int out = 0;

        // is a number?
        try {
            Integer.parseInt(input);
        } catch (NumberFormatException e) {
            out = 4;
        }

        // five digits?
        if(input.length() != 5){
            out = 4;
        }
        return out;
    }

    public int checkID(String input){
        int out = 0;
        char[] inputArr = input.toCharArray();

        // check if input is empty
        if(input.length() == 0){
            out = 5;
        }else{
            // check if input has a hyphen
            if(inputArr[2] != '-'){
                out = 5;
            }else{
                // check if first 2 are letters
                if(!(Character.isLetter(inputArr[0])) || !(Character.isLetter(inputArr[1]))){
                    out = 5;
                }
            }
        }

        // check if empty
        for(int i=3; i<7; i++){
            if(input.length() == 0){
                out = 5;
            }else{
                // check if last 4 are numbers (probably not necessary, but just in case)
                if(!(Character.isDigit(inputArr[i]))){
                    out = 5;
                    break;
                }
            }
        }
        return out;
    }

    // only adds text if an error had occurred
    public String generateResultString(int inputValResult, String name){
        // name is "first" or "last"

        String out = "";

        switch (inputValResult){
            // problem cases
            case 1 -> out += "The " + name + " name must be at least 2 characters long.\n";
            case 2 -> out += "The " + name + " name must be filled in.\n";
            case 3 -> out += "The " + name + " name must be at least 2 characters long.\n" //in case it's both
                           + "The " + name + " name must be filled in.\n";
            case 4 -> out += "The employee ID must be in the format of AA-1234.\n";
            case 5 -> out += "The zipcode must be a 5 digit number.\n";

            default -> out = ""; // everything is OK
        }

        // message for everything being OK
        if(name.equalsIgnoreCase("first") && inputValResult == 0){
            out += "There were no errors found.";
        }
        return out;
    }
}
