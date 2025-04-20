package Recursion;

public class Rec_fibboNumber {

    public static void main(String[] args) {
        int k= fib(3);
        System.out.println(k);

    }

        public static int fib(int n) {
            if(n==0) return 0;
            else if(n==1) return 1;

            return fib(n-1)+fib(n-2);

        }
    }

