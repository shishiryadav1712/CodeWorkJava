package Recursion;

import java.util.Arrays;

public class mergeSort  {
    public static void main(String[] args) {
        int[]arr={45,12,3,56,56,2,12,5};
        arr=mergeSortingRec(arr);
        System.out.println(Arrays.toString(arr));


    }

    static int[] mergeSortingRec(int[] arr) {
        if(arr.length==1) return arr;

        int mid=arr.length/2;
        int []left=mergeSortingRec(Arrays.copyOfRange(arr,0,mid));
        int []right=mergeSortingRec(Arrays.copyOfRange(arr,mid,arr.length));

        return merging(left,right);



    }

    static int[] merging(int []left,int []right) {

        int [] mix=new int [left.length+right.length];
        int i=0,j=0,k=0;
        while(i<left.length && j<right.length) {
            if(left[i]<right[j]){
                mix[k]=left[i];
                i++;
            }
            else{
                mix[k]=right[j];
                j++;
            }
            k++;

        }
        while(i<left.length){
            mix[k]=left[i];
            k++;
            i++;
        }
        while(j<right.length){
            mix[k]=right[j];
            k++;
            j++;
        }

        return mix;
    }

}
