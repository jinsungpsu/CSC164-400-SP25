public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7,8,9}
        };
        int sumOfRow3 = arr[2][0] + arr[2][1] + arr[2][2];

        int sumOfRow3b = sumOfRequestedRow(arr, 3);
        int sumOfRow2 = sumOfRequestedRow(arr, 2);
    }

    /*
    Write a method that adds up a specific row of values in a 2 dimensional array of integers.
     */
    static int sumOfRequestedRow(int[][] arr, int row) {
        int sumOfRequestedRow = 0;
        for (int i = 0; i < arr[row-1].length; i++) {
            sumOfRequestedRow += arr[row-1][i];
        }
        return sumOfRequestedRow;
    }
}
