package Recursion.assignment;

public class Rec_BinSearch {
    public static void main(String[] args) {
        int [] arr={2,5,7,10,12,14,18};
        int target=12;
        System.out.println(search(arr,13,0,arr.length-1));


    }

    public static int search(int[]arr, int target, int start, int end) {

        if(start > end) return -1;

        int mid = start + (end - start)/2;
        if(arr[mid] == target) return mid;

        else if(arr[mid]>target) return search(arr, target, 0, mid-1);
        else return search(arr, target, mid+1, end);

    }


}
