package Recursion;

import java.util.ArrayList;

public class rec_AllInstancesOfanElement {
    public static void main(String[] args) {
        int [] arr={12,14,1,3,4,12,34,5,12,4};
        findAllIndex(arr,12,0);
        System.out.println(indices);

    }
    static ArrayList<Integer> indices = new ArrayList<>();
    static void findAllIndex(int [] arr, int key , int index){

        if(index==arr.length){
            return;
        }

            if (arr[index] == key) {
                indices.add(index);
            }
                findAllIndex(arr, key, index+1);



    }
}
