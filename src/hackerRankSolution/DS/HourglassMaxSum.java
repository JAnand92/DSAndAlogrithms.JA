package hackerRankSolution.DS;

public class HourglassMaxSum {

    static int sum = 0;
    static int[] totalSum = null;
    static int counter = 0;
    static int totalHourGlass = 0;
    static int max = 0;
    static int[][] testData = new int[4][4];
    static int maxValue = 0;
    public static void main(String[] args) {
        try {
            /*Prepare test data*/
            testData[0][0] = 1;testData[0][1] = 2;testData[0][2] = 9;testData[0][3] = 4;
            testData[1][0] = 0;testData[1][1] = -7;testData[1][2] = 8;testData[1][3] = 6;
            testData[2][0] = 7;testData[2][1] = 4;testData[2][2] = 3;testData[2][3] = 1;
            testData[3][0] = 0;testData[3][1] = 0;testData[3][2] = 8;testData[3][3] = 6;

            maxValue = hourglassMaxSum(testData);
            System.out.println("Maximum value is " + maxValue);
            maxValue = findMinInMatrixAndFindMaxInThatColumn(testData);
            System.out.println("Maximum value in column " + maxValue);
        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
    }

    /*This below code will sum all hourglass in 2D array and find max value among them*/
    private static int hourglassMaxSum(int arr[][]) {
        totalHourGlass = (arr.length-2) * (arr.length-2);
        System.out.println("Total hour glasses are " + totalHourGlass);
        totalSum= new int[totalHourGlass];
        try {
            for(int i=0;i<arr.length-2;i++) {
                for(int j=0;j<arr.length-2;j++) {
                    sum = arr[i][j] + arr[i][j+1] + arr[i][j+2]
                            + arr[i+1][j+1]
                            + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];

                    totalSum[counter] = sum;
                    sum = 0;
                    counter ++;
                }
            }
            max = totalSum[0];
            for(int i=1;i<totalHourGlass;i++) {
                if(totalSum[i] > max) {
                    max = totalSum[i];
                }
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return max;
    }

    /*This code will find min value in the matrix first, then find that column and then find max value
    * that column...*/
    private static int findMinInMatrixAndFindMaxInThatColumn(int arr[][]) {
        int maxValueInColumn = 0;
        try {
            int minValueInMatrix = arr[0][0];
            int minValueInColumn = 0;
            for(int i=0;i<arr.length;i++) {
                for(int j=0;j<arr.length;j++) {
                    if(arr[i][j] < minValueInMatrix) {
                        minValueInMatrix = arr[i][j];
                        minValueInColumn = j;
                    }
                }
            }
            System.out.println("Min value in Matrix " + minValueInMatrix);

            maxValueInColumn = arr[0][minValueInColumn];
            int k=0;
            while(k<arr.length) {
                if(maxValueInColumn <arr[k][minValueInColumn]) {
                    maxValueInColumn = arr[k][minValueInColumn];
                }
                k++;
            }

        } catch (Exception e) {
            System.out.println(e.fillInStackTrace());
        }
        return maxValueInColumn;
    }
}
