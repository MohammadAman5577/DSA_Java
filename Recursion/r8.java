package Recursion;
// print x^n
public class r8 {
    public static int power (int x, int n){
        if(n==0){
            return 1;
        }
        // int xm1=power(x,n-1);
        // int xn= x*xm1;
        // return xn;

        // OR

        return x*power(x, n-1);
    }
    public static void main(String[] args) {
        int x=2;
        int n=2;
        System.out.println(power(6, 3));
    }
    
}
