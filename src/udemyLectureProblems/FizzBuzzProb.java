package udemyLectureProblems;

public class FizzBuzzProb {

    /*Write a program that print the number from 1 to n. But, for multiples of 3 print "fizz"
    * instead of the number and for the multiples of 5 print "buzz". For numbers which are multiple of both
    * 3 and 5 print "fizzbuzz" */

    public static void main(String[] args) {
        try {
            fizzBuzz(15);

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    private static void fizzBuzz(int n) {
        try {
            for(int i=1;i<=n;i++) {
                if(i%3 == 0 && i%5 == 0) {
                    System.out.println("fizzbuzz");
                } else if(i%3 == 0) {
                    System.out.println("fizz");
                } else if(i%5 == 0) {
                    System.out.println("buzz");
                } else {
                    System.out.println(i);
                }
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
