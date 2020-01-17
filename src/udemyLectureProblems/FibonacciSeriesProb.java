package udemyLectureProblems;


import java.util.HashMap;
import java.util.Set;

public class FibonacciSeriesProb {
    static int n1 = 0, n2 = 1, result = 0;

    public static void main(String[] args) {
        try {
            fibonacciSeries(5);
            System.out.println();

            System.out.print(" " + n1 + " " + n2);
            fibonacciSeriesWithRecursion(3);

            System.out.println();
            System.out.println(" " + findFibonacciNumber(4));

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void fibonacciSeries(int n) {
        try {
            System.out.println("***FIBONACCI SERIES***");
            HashMap<Integer, Integer> fNumbers = new HashMap<>();
            fNumbers.put(1,0); fNumbers.put(2,1);
            for(int i=3;i<=n;i++) {
                int result = fNumbers.get(i-2) + fNumbers.get(i-1);
                fNumbers.put(i, result);
            }
            Set<Integer> fSeries = fNumbers.keySet();
            for(Integer integer : fSeries) {
                System.out.print(" " + fNumbers.get(integer));
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void fibonacciSeriesWithRecursion(int n) {
        try {
            if(n>0) {
                result = n1 + n2;
                n1 = n2;
                n2 = result;
                System.out.print(" " + result);
                fibonacciSeriesWithRecursion(n-1);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static int findFibonacciNumber(int n) {
        try {
            if(n<2) {
                result = n;
            } else {
                result = findFibonacciNumber(n-1) + findFibonacciNumber(n-2);
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return result;
    }
}
