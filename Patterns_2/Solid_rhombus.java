
package Patterns_2;
public class Solid_rhombus {
    public static void Function(int n){
        for (int i=1; i<=n;i++){
            //spaces
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }   
             System.out.println();
        }
    }
    public static void main(String args[]){
        Function(5);
    }

}