package assignment2.ex25.base;

public class PasswordCheck {

    public int passwordValidator(String password){
        char passArr[] = password.toCharArray();
        char[] specialChars = new char[]{'!', '@', '#', '$', '%', '*', '?'}; // special characters i could think of atm

        int result = 0;

        for(int i=0; i<(passArr.length); i++){
            // only numbers?
            if(Character.isDigit(passArr[i]) && password.length() < 8){
                result = 1;
            }
            // only letters?
            if(Character.isLetter(passArr[i]) && password.length() < 8){
                result = 2;
            }
            // both?
            if((Character.isDigit(passArr[i]) || Character.isLetter(passArr[i])) && password.length() >= 8){
                result = 3;
            }
        }

        // special characters?
        for(int i=0; i<(passArr.length); i++){
            for(int j=0; j<(specialChars.length); j++){
                if(Character.compare(passArr[i], specialChars[j]) == 0 && password.length() >= 8){
                    result = 4;
                    break;
                }
            }
        }

        return result;
    }

    public String validationResult(int strength, String password){
        String out = "The password '" + password;

        switch (strength){
            case 1 -> out += "' is a very weak password.";
            case 2 -> out += "' is a weak password.";
            case 3 -> out += "' is a strong password.";
            case 4 -> out += "' is a very strong password.";
        }
        return out;
    }
}
