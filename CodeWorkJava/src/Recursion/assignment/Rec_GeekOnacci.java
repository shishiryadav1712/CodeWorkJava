package Recursion.assignment;

public class Rec_GeekOnacci {
    public static void main(String[] args) {
        int n=3;
        for (int i = 1; i <= n; i++) {
            System.out.println(GeekOnaki(1, 3, 2, n+i));
        }

    }

    static int GeekOnaki(int a, int b, int c, int n){
        if(n==1) return a;
        if (n==2) return b;
        if(n==3) return c;
        return GeekOnaki(a,b, c,n-1) + GeekOnaki(a,b,c,n-2)+GeekOnaki(a,b,c,n-3);
    }

}
