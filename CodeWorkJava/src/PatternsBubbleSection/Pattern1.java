package PatternsBubbleSection;

public class Pattern1 {
    public static void main(String[] args) {
        patternForm(4,0);
        patternForm2(5,0);
    }
    static void patternForm(int row, int col){
        if(row==0) return;
        if(col<row){
            System.out.print("*");
            patternForm(row,col+1);
        }
        else{
            System.out.println();
            patternForm(row-1,0);
        }


    }

    static void patternForm2(int row, int col){
        if(row==0) return;
        if(col<row){

            patternForm2(row,col+1);
            System.out.print("*");
        }
        else{

            patternForm2(row-1,0);
            System.out.println();
        }


    }
}
