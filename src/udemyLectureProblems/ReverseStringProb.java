package udemyLectureProblems;

public class ReverseStringProb {

    public static void main(String[] args) {
        try {
           /* reverseStringUsingCharArray("apple");
            reverseStringUsingByteArray("orange");
            reverseStringUsingStringBuilder("mango");
            reverseString("Love");
            reverseInt(123);*/
            String str = reverseStringRecursive("Love");
            System.out.println(str);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void reverseStringUsingCharArray(String str) {
        try {
            char [] reverseString = new char[str.length()];
            for(int i = 0; i<str.length(); i++) {
                reverseString[i] = str.charAt((str.length()-1) - i);
            }
            System.out.println(new String(reverseString));
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void reverseStringUsingByteArray(String str) {
        try {
            byte [] reverseString = str.getBytes();
            for(int i = 0 ; i < str.length(); i++) {
                reverseString[i] = (byte) str.charAt((str.length()-1) - i);
            }
            System.out.println("\n" + new String(reverseString));
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void reverseStringUsingStringBuilder(String str) {
        try {
           /* StringBuilder stringBuilder = new StringBuilder();
            stringBuilder = stringBuilder.append(str);
            stringBuilder = stringBuilder.reverse();
            System.out.println("\n" + stringBuilder);*/
           /*Above 4 lines are combined into 1 line of code!*/
            System.out.println("\n" + new StringBuilder().append(str).reverse());
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void reverseString(String str) {
        try {
            String revStr = "";
            for(int i=str.length()-1;i>=0;i--) {
                revStr += str.charAt(i);
            }
            System.out.println("Reverse String : " + revStr);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void reverseInt(int val) {
        try {
            String myVal = String.valueOf(val);
            String revStr = "";
            for(int i = myVal.length()-1; i>=0;i--) {
                revStr += myVal.charAt(i);
            }
            System.out.println("Reverse Integer is " + Integer.valueOf(revStr));
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*How to reverse a string recursively?*/
    private static String reverseStringRecursive(String str) {
        if((str == null) || (str.length() <= 1)) {
            return str;
        }
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }
}
