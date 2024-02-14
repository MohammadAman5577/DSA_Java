package Recursion;
// optimised power function

public class r9 {
    public static int OptimisedPower(int x, int n){
        // base case
        if (n==0){
            return 1;
        }
        int halfpower = OptimisedPower(x, n/2);

        int halfPowerSquare=halfpower*halfpower;

        // for odd power ie n
        if(n%2!=0){
            halfPowerSquare = x *halfPowerSquare;
        }
        return halfPowerSquare;
    }    
    public static void main(String[] args) {
        System.out.println(OptimisedPower(2, 4));
    }
}
