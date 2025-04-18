package Recursion;

import java.util.ArrayList;

public class rec_returnArrayList {
        public static void main(String[] args) {
            int [] arr={12,14,1,3,4,12,34,5,12,4};
            System.out.println(findAllIndex(arr,12,0,new ArrayList<>()));
            System.out.println(findAllIndex2(arr,4,0));
        }
        static ArrayList<Integer> findAllIndex(int [] arr, int key , int index,ArrayList<Integer> indices){

            if(index==arr.length){
                return indices;
            }

            if (arr[index] == key) {
                indices.add(index);
            }
           return findAllIndex(arr, key, index+1,indices);



        }

        static ArrayList<Integer> findAllIndex2(int [] arr, int key , int index){
            ArrayList<Integer> indices = new ArrayList<>();
            if(index==arr.length){
                return indices;
            }
            if (arr[index] == key) {
                indices.add(index);
            }
            ArrayList<Integer> fromBelowCalls=findAllIndex2(arr, key, index+1);
            indices.addAll(fromBelowCalls);

            return indices;
        }
    }


