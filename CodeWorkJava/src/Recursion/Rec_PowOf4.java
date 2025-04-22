package Recursion;

public class Rec_PowOf4 {
    public static void main(String[] args) {
        System.out.println(helper(25));
    }

    static boolean helper(int num) {
        if (num == 1) return true;
        if (num == 0 || num % 4 != 0) return false;
        return helper(num / 4);
    }
}
