package Recursion.assignment;

public class Rec_SumNos{
    public static void main(String[] args) {
        int result=sum(13345);
        System.out.println(result);

    }

    static int sum(int num){
        if(num == 0) return 0;

        return (num%10+sum(num/10));


    }
}
