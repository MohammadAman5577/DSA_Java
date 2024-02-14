package Recursion;
// fibonacci series

// since fib(n)=fib(n-1)+fib(n-2)

public class r4 {
    public static int FibonacciSer(int n){
        if( n == 0 || n==1){
            return n;
        }
        int fnm1=FibonacciSer(n-1);
        int fnm2=FibonacciSer(n-2);
        int fn=fnm1+fnm2;
        return fn;
    }
    public static void main(String[] args) {
        int n=5;
        System.out.println(FibonacciSer(24));
        System.out.println(FibonacciSer(3));
    }
}
