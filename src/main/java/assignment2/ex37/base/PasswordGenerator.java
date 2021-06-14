package assignment2.ex37.base;

import java.util.*;

public class PasswordGenerator {


    // character pool
    List<String> legalChars = new ArrayList<>(List.of("a","b","c","d","e","f","g","h","i",
            "j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"));

    List<String> legalSpecial = new ArrayList<>(List.of("!", "*", "%", "#", "@", "$"));



    // adds to password
    public String addSpecial(int numSpecial){
        String out = "";

        for (int i = 0; i < numSpecial; i++) {
            out += randChar(2);
        }
        return out;
    }

    public String addNumbers(int numNumbers){
        String out = "";

        for (int i = 0; i < numNumbers; i++) {
            out += randNum();
        }
        return out;
    }

    public String addLetters(int numLetters){
        String out = "";

        for (int i = 0; i < numLetters; i++) {
            out += randChar(1);
        }

        return out;
    }

    // chooses index of a random character to add
    public String randChar(int type){
        Random r = new Random();
        String out;
        switch (type){
            default:
                out = legalChars.get(r.nextInt(26)); // index from A to Z
                break;
            case 2:
                out = legalSpecial.get(r.nextInt(6)); // first couple special chars
                break;
        }
        return out;
    }

    public String randNum(){
        Random r = new Random();
        String out = Integer.toString(r.nextInt(10));
        return out;
    }

    // password is originally in order of concatenation, so we must randomize
    public String randomizePassword(String password){
        List<Object> out = Arrays.asList(password.split(""));
        Collections.shuffle(out);
        return out.toString().replace("[", "")
                .replace(", ", "")
                .replace("]", "");
    }

    public void displayPass(String password){
        System.out.println(randomizePassword(password));
    }

}
