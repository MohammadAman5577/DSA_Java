package Recursion;

// Sum of n natural numbers

public class r3 {
    public static int Sum(int n){
        if (n==0){
            return 0;
        }
        int sm1=Sum(n-1);
        int s= n + Sum(n-1);
        return s;
    }
    public static void main(String[] args) {
        int n=3 ;
        System.out.println(Sum(n));
    }
}
