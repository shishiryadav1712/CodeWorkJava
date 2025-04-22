package Recursion.assignment;

public class Rec_NumSum {
    public static void main(String[] args) {
        System.out.println(sum(5));

    }

    static int sum(int num){
        if(num<=1) return num;
        return num+sum(num-1);
    }
}
