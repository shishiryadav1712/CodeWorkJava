package Recursion.assignment;

public class MaxMin {
    public static void main(String[] args) {
        int [] arr={1,4,45,6,-50,10,2};
        int num1=arr.length;
        System.out.println(maxmin(arr,num1));
    }



    public static int maxmin(int[] arr, int num1) {

        if (num1 == 1) return arr[0];
        return Math.min(arr[num1 - 1], maxmin(arr, num1 - 1));

    }
}