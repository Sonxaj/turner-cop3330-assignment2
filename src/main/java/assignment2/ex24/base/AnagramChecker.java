package assignment2.ex24.base;

import java.util.Arrays;
import java.util.Locale;

public class AnagramChecker {

    public String displayResult(boolean isAnagramResult, String word1, String word2){
        String out = "\"" + word1 + "\"" + " and " + "\"" + word2 + "\" are";

        if(isAnagramResult){
            out += " anagrams.";
        }else{
            out += " not anagrams.";
        }
        return out;
    }

    public boolean isAnagram(String word1, String word2){
        boolean out = false; //by default, assume they aren't anagrams
        word1 = sortedWord(word1);
        word2 = sortedWord(word2);

        if(word1.length() == word2.length()) { //length
            if(word1.equalsIgnoreCase(word2)) { //content
                out = true;
            }
        }
        return out;
    }

    public String sortedWord(String word){
        char[] wordToCheck = word.toLowerCase(Locale.ROOT).toCharArray(); //lowercase to simplify checks
        Arrays.sort(wordToCheck); //sorted
        return Arrays.toString(wordToCheck); //now a sorted string
    }
}
