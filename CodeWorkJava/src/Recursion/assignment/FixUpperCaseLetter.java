package Recursion.assignment;

public class FixUpperCaseLetter {
    public static void main(String[] args) {
        String str="finDchar";
        System.out.println(fix(str,0));
    }

    public static char fix(String str, int i){
        if(i>=str.length()) return '0';
        if(Character.isUpperCase(str.charAt(i))) return str.charAt(i);
        else return fix(str,i+1);
    }
}
