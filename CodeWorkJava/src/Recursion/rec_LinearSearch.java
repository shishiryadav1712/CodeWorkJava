package Recursion;

public class rec_LinearSearch {
    public static void main(String[] args) {
    int [] arr= {12,3,5,23,6};
    int key = 44;

        System.out.println(linearSearch(arr,key,0));
    }

    static boolean linearSearch(int[] arr, int key, int index) {

        if(index == arr.length){
            return false;
        }
        return arr[index]==key || linearSearch(arr, key, index+1);
    }
}
