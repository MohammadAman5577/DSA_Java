package Patterns_2;

public class Butterfly {
     public static void aman (int n){
        // ist half 
        for(int i=1;i<=n;i++){
            
            //stars _ i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces_ 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            
            // stars_ i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        // 2nd half
        for(int i=n;i>=1;i--){
              
            //stars _ i
            for (int j=1;j<=i;j++){
                System.out.print("*");
            }

            //spaces_ 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            
            // stars_ i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
     }
    public static void main (String args []){
        aman (4);

    }
   
    
}
