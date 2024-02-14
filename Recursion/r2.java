package Recursion;
// factorial of a number

public class r2 {
    public static int factorial(int n){
        if (n==0){
            return 1;
        }
        int fm1 =  factorial(n-1);
        int  fn = n*factorial(n-1);
        return fn;
    }
    public static void main(String[] args) {
        int n=9;
        System.out.println(factorial(n));
    }
}
