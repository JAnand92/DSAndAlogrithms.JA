package udemyLectureProblems;

import java.util.ArrayList;

public class CapitalizationProb {
    public static void main(String[] args) {
        try {
            capitalizationOfEachWordInSentence("hello there!!!");
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Capitalize the first letter of each word in the sentence.*/
    private static void capitalizationOfEachWordInSentence(String str) {
        try {
            String newStr = null;
            ArrayList<String> newSentence = new ArrayList<>();
            String[] words = str.split("\\s");

            for(String w : words) {
                newStr = w.substring(0,1).toUpperCase().concat(w.substring(1));
                newSentence.add(newStr);
            }
            for(String s : newSentence) {
                System.out.print(' ' +s);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
