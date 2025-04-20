package Recursion.assignment;

public class Rec_Print1ToN {
    public static void main(String[] args) {
        printNos(1);
    }


    public static void printNos(int n) {
        if(n==0){
            return;
        }

        if(n>=1){
            printNos(n-1);
            System.out.print(n+" ");
        }

    }

}
