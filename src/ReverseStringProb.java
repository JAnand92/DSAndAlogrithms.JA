public class ReverseStringProb {

    public static void main(String[] args) {
        try {
            reverseStringUsingCharArray("apple");
            reverseStringUsingByteArray("orange");
            reverseStringUsingStringBuilder("mango");
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
}
