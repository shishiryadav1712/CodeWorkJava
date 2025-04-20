package Recursion.assignment;

public class Rec_ReverseString {
    public static void main(String[] args) {

        char[]str = {'h','e','l','l','o'};
        reverseString(str, 0, str.length-1);
        System.out.println(str);

    }
    public static void reverseString(char[] str,int start,int end) {
        if(start >= end) {
            return ;
        }

            char temp = str[start];
            str[start] = str[end];
            str[end]=temp;
            reverseString(str,start+1,end-1);

        }


    }



