package udemyLectureProblems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;


public class ArrayChunking {

    public static void main(String[] args) {
        try {
            int[] testData = new int[5];
            testData[0] = 1; testData[1] = 3;/* testData[2] = 5; testData[3] = 3; testData[4] = 2;*/
            /*array2Parts(testData);*/
            arrayChunk(testData, 2);

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Divide one big array into many sub-array of given size...*/
    private static void arrayChunk(int[] arr, int size) {
        try {


        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
    /*Function to split array into 2 parts!*/
    private static void array2Parts(int[] arr) {
        try {
            int n = arr.length;
            int[] a = new int[(n+1)/2];
            int[] b = new int[n-a.length];

            for(int i = 0; i<n; i++) {
                if(i<a.length) {
                    a[i] = arr[i];
                } else {
                    b[i-a.length] = arr[i];
                }
            }
            System.out.println(Arrays.toString(a));
            System.out.println(Arrays.toString(b));
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
