package Recursion.assignment;

import java.util.Arrays;

public class SumTriangle {
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        trinagle(arr);
    }
    public static void trinagle(int [] ar){
        if(ar.length<1) return;

        int[] stepArray = new int[ar.length-1];
        for(int i=0;i<ar.length-1;i++){
            int x=ar[i]+ar[i+1];
            stepArray[i]=x;
        }

        trinagle(stepArray);
        System.out.println(Arrays.toString(ar));

    }
}
