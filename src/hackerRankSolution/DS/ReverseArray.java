package hackerRankSolution.DS;

public class ReverseArray {

    static int[] reverseA = null;
    static int[] b = null;

    public static void main(String[] args) {
        try {
            /*Prepare Test Data*/
            int[] inputData = new int[4];
            inputData[0] = 2;inputData[1] = 3;inputData[2] = 4;inputData[3] = 5;
            reverseA = new int[4];
            reverseA = reverseArray(inputData);

            /*Print the array after reversing it.*/
            System.out.println("Reverse Array is: ");
            for(int i = 0;i<inputData.length;i++) {
                System.out.print(" " +reverseA[i]);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*This code will reverse the array.*/
    private static int[] reverseArray(int[] a) {
        try {
            int n = a.length;
            b = new int[n];
            for(int i=0;i<n;i++) {
                b[i] = a[(n-1)-i];
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return b;
    }
}
