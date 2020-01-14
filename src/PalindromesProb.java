public class PalindromesProb {
    public static void main(String[] args) {
        try {
            palindromesUsingStringBuilder("adda");
            palindromeUsingBytes("dada");
            palindromeUsingChar("nana");
            checkPalindromeNumber(121);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void palindromesUsingStringBuilder(String str) {
        try {
            String reverseString = String.valueOf(new StringBuilder().append(str).reverse());
            if(reverseString.equals(str)) {
                System.out.println("Palindrome!");
            } else {
                System.out.println("Not Palindrome!");
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void palindromeUsingBytes(String str) {
        try {
            byte [] reverseStr = str.getBytes();
            for(int i = 0; i<str.length();i++) {
                reverseStr[i] = (byte) str.charAt(str.length()-1-i);
            }
            if(String.valueOf(reverseStr).equals(str)) {
                System.out.println("Palindrome!");
            } else {
                System.out.println("Not Palindrome!");
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void palindromeUsingChar(String str) {
        try {
            char [] reverseStr = new char[str.length()];
            for(int i = 0; i<str.length();i++) {
                reverseStr[i] = str.charAt(str.length()-1-i);
            }
            if(String.valueOf(reverseStr).equals(str)) {
                System.out.println("Palindrome!");
            } else {
                System.out.println("Not Palindrome!");
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Check number is palindrome or not*/
    private static void checkPalindromeNumber(int myNumber) {
        try {
            String myNumIntoString = String.valueOf(myNumber);
            String reverseString = String.valueOf(new StringBuilder().append(myNumIntoString).reverse());
            if(Integer.valueOf(reverseString) == myNumber) {
                System.out.println("Palindrome Number!");
            } else {
                System.out.println("Not Palindrome Number!");
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
