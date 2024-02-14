package Patterns_2;
public class Inverted_halfpyramid_numbers {
    public static void Function(int n){
        for (int i=1; i<=n;i++){
            for (int j=1; j<=n-i+1;j++){
                System.out.print(j+" ");
            }
        System.out.println();
        }
    }
    public static void main(String args[]){
        Function(999);
    }

}