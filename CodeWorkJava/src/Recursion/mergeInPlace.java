package Recursion;

import java.util.Arrays;

public class mergeInPlace {
    public static void main(String[] args) {
        int[]arr={45,12,3,56,56,2,12,5};
        mergeSortingRecInPlace(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));


    }

    static void mergeSortingRecInPlace(int[] arr, int start, int end) {
        if(end-start==1) return ;

        int mid=start+(end-start)/2;
        mergeSortingRecInPlace(arr,start,mid);
        mergeSortingRecInPlace(arr,mid,end);

         mergingInPlace(arr, start,mid,end);



    }

    static void mergingInPlace(int []arr, int start, int mid, int end) {

        int [] mix=new int [end-start];
        int i=start,j=mid,k=0;
        while(i<mid && j<end) {
            if(arr[i]<arr[j]){
                mix[k]=arr[i];
                i++;
            }
            else{
                mix[k]=arr[j];
                j++;
            }
            k++;

        }
        while(i<mid){
            mix[k]=arr[i];
            k++;
            i++;
        }
        while(j<end){
            mix[k]=arr[j];
            k++;
            j++;
        }
        for(int p=0;p<mix.length;p++){
            arr[start+p]=mix[p];

        }


    }

}
