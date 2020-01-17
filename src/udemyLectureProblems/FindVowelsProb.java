package udemyLectureProblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FindVowelsProb {

    public static void main(String[] args) {
        try {
            findVowels("Hello There!");
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*This function will return all the vowels in the any string*/
    private static void findVowels(String str) {
        try {
            char[] chars = str.replaceAll("\\s", "").toLowerCase().toCharArray();
            HashMap<Character, Integer> hashMap = new HashMap<>();

            /*Get the number of all characters in string.*/
            for(Character c : chars) {
                if(hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap.get(c) + 1);
                } else {
                    hashMap.put(c,1);
                }
            }
            Set<Character> vowels = new HashSet<>();
            vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o'); vowels.add('u');
            Set<Character> characterSet = hashMap.keySet();

            int result = 0;
            for(Character c : characterSet) {
                for(Character c1 : vowels) {
                    if(c.equals(c1)) {
                        result += hashMap.get(c);
                    }
                }
            }
            System.out.println("Total vowels present in the string is " + result + ".");


        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
