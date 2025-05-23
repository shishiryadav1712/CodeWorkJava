package PatternsBubbleSection;

import java.util.Arrays;

public class rec_selectionSort {
    public static void main(String[] args) {

        int[] arr = { 4, 5, 6, 12 , 8, 9 };
        selection(arr,arr.length,0,0);
        System.out.println(Arrays.toString(arr));

    }

    static void selection(int[] arr, int row, int col, int max) {
        if (row == 0) return;
        if (col < row) {
            if (arr[col] > arr[max]) {
                selection(arr, row, col + 1, col);
            } else {
                selection(arr, row, col+1, max);

            }
        } else {
            int temp = arr[max];
            arr[max] = arr[row-1];
            arr[row-1] = temp;


            selection(arr, row - 1, 0, 0);
        }


    }
}


