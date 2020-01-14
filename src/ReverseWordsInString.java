
public class ReverseWordsInString {
    public static void main(String[] args) {
        try {
            reverseWordsInString("Hello World!");

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
}
