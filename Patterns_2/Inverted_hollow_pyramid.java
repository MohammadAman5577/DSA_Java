package Patterns_2;

public class Inverted_hollow_pyramid {
    public static void InvertedTriangle (int n){
        //outer loop
        for(int i=1;i<=n;i++){
            //spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            
            }
             System.out.println();
        }

       

    }
    public static void main (String args[]){
        InvertedTriangle(5);
    }
    
}
