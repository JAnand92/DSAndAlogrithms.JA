package udemyLectureProblems;

public class StepsProb {

    public static void main(String[] args) {
        try {
            pattern1(3);
            pattern2(3);
            pattern3(3);
            pattern4(3);
            pattern5(3);
            pattern6(3);
            pattern7(3);
            pattern8(3);
            pattern9(3);
            pattern10(3);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*
    * #
    * ##
    * ###
    * */
    /*Normal * pattern in +90 degree shape*/
    private static void pattern1(int n) {
        try {
            for(int i = 0;i<n;i++) {
                for(int j=0;j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }


    /*  #
    *  ##
    * ###
    * */
    /*Normal * pattern in -90 degree shape*/
    private static void pattern2(int n) {
        try {
           for(int i=0;i<n;i++) {
               /*Count and print space*/
               for(int j=n-i;j>1;j--) {
                   System.out.print(" ");
               }
               for(int k=0;k<=i;k++) {
                   System.out.print("#");
               }
               System.out.println();
           }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*
    * ###
    * ##
    * #
    * */
    private static void pattern3(int n) {
        try {
            for(int i=0;i<n;i++) {
                for(int j=n-i;j>0;j--) {
                    System.out.print("#");
                }
                /*Count space and print*/
                for(int k=0;k<i;k++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*###
    *  ##
    *   #
    */
    private static void pattern4(int n) {
        try {
            for(int i=0;i<n;i++) {
                /*Count space and print*/
                for(int k=0;k<i;k++) {
                    System.out.print(" ");
                }
                for(int j=n-i;j>0;j--) {
                    System.out.print("#");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*  #
    *  ###
    * #####
    * */
    private static void pattern5(int n) {
        try {
            for(int i=0;i<n;i++) {
                for(int j=i;j<n;j++) {
                    System.out.print(" ");
                }
                for(int k=0;k<=(i*2);k++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*
    * #####
    *  ###
    *   #
    * */
    private static void pattern6(int n) {
        try {
            for(int i=0;i<n;i++) {
                for(int j=0;j<i;j++) {
                    System.out.print(" ");
                }
                for(int k=2*(n-i);k>1;k--) {
                    System.out.print("#");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*
    * #
    * ##
    * ###
    * ##
    * #
    * */
    private static void pattern7(int n) {
        try {
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            for(int i=1;i<=n;i++) {
                for(int j=n-i;j>=1;j--) {
                    System.out.print("#");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /* #
    * ###
    *#####
    * ###
    *  #
    */
    private static  void pattern8(int n) {
        try {
            for(int i=1;i<=n;i++) {
                for(int j=n-i;j>=1;j--) {
                    System.out.print(" ");
                }
                for(int k=1;k<2*i;k++) {
                    System.out.print("#");
                }
                System.out.println();
            }
            for(int i=1;i<=n;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print(" ");
                }
                for(int k=2*(n-i);k>1;k--) {
                    System.out.print("#");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Left triangle pascal's*/
    /*
    *   #
    *  ##
    * ###
    *  ##
    *   #
    * */
    private static void pattern9(int n) {
        try{
            for(int i=1;i<=n;i++) {
                for(int j=n-i;j>=1;j--) {
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++) {
                    System.out.print("#");
                }
                System.out.println();
            }

            for(int i=1;i<n;i++) {
                for(int j=1;j<=i;j++) {
                    System.out.print(" ");
                }
                for(int k=1;k<=(n-i);k++) {
                    System.out.print("#");
                }
                System.out.println();
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*Sand glass star pattern*/
    /*#####
       ###
    *   #
    *  ###
    * #####
    */
    private static void pattern10(int n) {
        try {
            for(int i=0;i<n;i++) {
               for(int j=0;j<i;j++) {
                   System.out.print(" ");
               }
               for(int k=2*(n-i);k>1;k--) {
                   System.out.print("#");
               }
                System.out.println();
            }

            for(int i=1;i<n;i++) {
                for(int j=n-i;j>1;j--) {
                    System.out.print(" ");
                }
                for(int k=0;k<=2*i;k++) {
                    System.out.print("#");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }
}
