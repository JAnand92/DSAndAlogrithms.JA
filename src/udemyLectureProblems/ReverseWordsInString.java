package udemyLectureProblems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ReverseWordsInString {
    public static void main(String[] args) {
        try {
            /*reverseWordsInString("Hello World!");
            maxChars("Hello Three!");
            countOccurrenceOfEachCharInString("hello brother!");
            countDuplicateCharInString("hello brother!");
            findFirstRepeatedAndNonRepeatedCharInString("hello!");*/
            findTwoStringsAreAnagramOrNot("Hello Th22ere!!!", "he22llo There!");
            isAnagramUsingSortMethod("Hello Th22ere!!!", "he22llo There!");

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void reverseWordsInString(String str) {
        try {
            String [] words = str.split("\\s");
            String [] reverseString = new String[words.length];

            for(int i = 0; i<words.length; i++) {
                reverseString[i] = words[words.length-1-i];
                System.out.print(" " + reverseString[i]);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Given a string, return the character that are the most commonly used in the string.*/
    /*Some similar questions like this:
    * What is the most common character in the string.
    * Does String A have the same characters as String B (is it an anagram).
    * Does the given string have any repeated character in it.*/
    private static void maxChars(String str) {
        try {

            /*Replace all the white space if there in string...*/
            char[] charArray = str.replaceAll("\\s", "").toCharArray();

            /*Create a charMap for counting the char in the string...*/
            HashMap<Character, Integer> charCountMap = new HashMap<>();

            /*Go through each and every char in map, if any char exists more than one increment key value more than 1.*/
            for(char c : charArray) {
                if(charCountMap.containsKey(c)) {
                    charCountMap.put(c, charCountMap.get(c)+1);
                } else {
                    charCountMap.put(c, 1);
                }
            }

            /*To traverse through hashMap*/
            Set<Map.Entry<Character, Integer>> entrySet = charCountMap.entrySet();
            int maxCount = 0;
            char maxChar = 0;

            for(Map.Entry entry : entrySet) {
                if((int)entry.getValue() > maxCount) {
                    maxCount = (int) entry.getValue();
                    maxChar = (char)entry.getKey();
                }
            }

            System.out.println(charCountMap);
            System.out.println(maxChar + " : " + maxCount);

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*How to count occurrences of each character in a string?*/
    private static void countOccurrenceOfEachCharInString(String str) {
        try {
            String strWithoutWhiteSpace = str.replaceAll("\\s","");
            HashMap<Character, Integer> charMap = new HashMap<>();

            /*We can deal with the string without converting to charArray but charArray makes life easy!*/
           /* for(int i = 0; i<strWithoutWhiteSpace.length();i++) {
                if(!charMap.containsKey(strWithoutWhiteSpace.charAt(i))) {
                    charMap.put(strWithoutWhiteSpace.charAt(i), 1);
                } else {
                    charMap.put(strWithoutWhiteSpace.charAt(i), charMap.get(strWithoutWhiteSpace.charAt(i))+1);
                }
            }*/
           char[] charArray = strWithoutWhiteSpace.toCharArray();
           for(char c : charArray) {
               if(charMap.containsKey(c)) {
                   charMap.put(c, charMap.get(c) + 1);
               } else {
                   charMap.put(c, 1);
               }
           }
            System.out.println(charMap);

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*How to count duplicate characters from a string?*/
    private static void countDuplicateCharInString(String str) {
        try {
            String strWithoutSpace = str.replaceAll("\\s","");
            char[] charArray = strWithoutSpace.toCharArray();

            HashMap<Character, Integer> hashMap = new HashMap<>();

            for(char c : charArray) {
                if(hashMap.containsKey(c)) {
                    hashMap.put(c, hashMap.get(c)+1);
                } else {
                    hashMap.put(c,1);
                }
            }
            System.out.println(hashMap);
            /*Set<Map.Entry<Character, Integer>> entries = hashMap.entrySet();

            for(Map.Entry entry : entries) {
                if((int) entry.getValue() > 1) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                }
            }*/
            /*Other way of doing this...*/
            Set<Character> characters = hashMap.keySet();
            for(Character c : characters) {
                if(hashMap.get(c) > 1) {
                    System.out.println(c + ":" + hashMap.get(c));
                }
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*How to find first repeated and non-repeated characters from a string?*/
    private static void findFirstRepeatedAndNonRepeatedCharInString(String str) {
        try {
            String newStr = str.replaceAll("\\s", "");
            char[] charArray = newStr.toCharArray();

            HashMap<Character, Integer> hashMap = new HashMap<>();
            for(char c : charArray) {
                if(!(hashMap.containsKey(c))) {
                    hashMap.put(c,1);
                } else {
                    hashMap.put(c, hashMap.get(c)+1);
                }
            }
            /*For first non-repeated character*/
            for(char c : charArray) {
                if(hashMap.get(c) == 1) {
                    System.out.println(c + " : " + "First Non-Repeated character!");
                    break;
                }
            }

            /*For first Repeated character*/
            for(char c : charArray) {
                if(hashMap.get(c) > 1) {
                    System.out.println(c + " : " + "First Repeated character!");
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Java program to check two strings are anagram or not*/
    /*Step 1: Build map first with char and their repeated value.*/
    private static HashMap buildHashMap(String str) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        try {
            /*[^\\w] is to replace all the punctuation remarks from sentences...*/
            String cleanStr = str.replaceAll("[^\\w]", "").toLowerCase();
            char[] chars = cleanStr.toCharArray();
            for(char c : chars) {
                if(!(hashMap.containsKey(c))) {
                    hashMap.put(c,1);
                } else {
                    hashMap.put(c, hashMap.get(c)+1);
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return hashMap;
    }
    private static void findTwoStringsAreAnagramOrNot(String str1, String str2) {
        try {
           HashMap<Character, Integer> hashMap1 = buildHashMap(str1);
           HashMap<Character, Integer> hashMap2 = buildHashMap(str2);

           Set<Map.Entry<Character, Integer>> entries1 = hashMap1.entrySet();
           Set<Map.Entry<Character, Integer>> entries2 = hashMap2.entrySet();

           if(entries1.size() != entries2.size()) {
               System.out.println("Not Anagram!");
           } else {
               if(entries1.equals(entries2)) {
                   System.out.println("Anagram!");
               }
           }
           /*Different way of doing it...*/
            Set<Character> characters1 = hashMap1.keySet();
            Set<Character> characters2 = hashMap2.keySet();

            if(characters1.size() != characters2.size()) {
                System.out.println("Not Anagram!");
            } else {
                if (characters1.equals(characters2)) {
                    System.out.println("Anagram!");
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*This method will check anagram using sort method.*/
    private static void isAnagramUsingSortMethod(String str1, String str2) {
        try {
            char[] chars1 = str1.replaceAll("[^\\w]", "").toLowerCase().toCharArray();
            Arrays.sort(chars1);
            char[] chars2 = str2.replaceAll("[^\\w]", "").toLowerCase().toCharArray();
            Arrays.sort(chars2);
            boolean flag = Arrays.equals(chars1,chars2);
            if(flag) {
                System.out.println("Anagram!");
            } else {
                System.out.println("Not Anagram!");
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

}
