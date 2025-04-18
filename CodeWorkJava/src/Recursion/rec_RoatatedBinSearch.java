package Recursion;

public class rec_RoatatedBinSearch {
    public static void main(String[] args) {

        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,2,0,arr.length-1));

    }

    static int search(int[] arr, int key, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start +(end-start) / 2;
        if (arr[mid] == key) {
            return mid;
        }
        if (arr[start]<= arr[mid]) {
            if(key>=arr[start] && key<=arr[mid]) {
                return search(arr, key, start, mid-1);
            }
            else{
                return search(arr, key, mid+1, end);
            }
        }
        if(key>=arr[mid] && key<=arr[end]) {
            return search(arr, key,mid+1, end);
        }
        return search(arr, key, start, mid-1);
    }
}
