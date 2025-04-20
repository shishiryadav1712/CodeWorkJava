package Recursion;

public class Rec_StringLength {

    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(length(str));

    }

    static int length(String str) {
        if(str.equals("")) return 0;
        else return length(str.substring(1))+1;

    }
}
