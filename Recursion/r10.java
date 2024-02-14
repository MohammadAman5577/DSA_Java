package Recursion;
// Tiling Problem

public class r10 {
    public static int TilingProb(int n){ // telling there are 2 x n ways
        // base case
        if(n==0 || n==1){
            return 1;
        }
        // kaam
        
        // vertical
        int fnm1= TilingProb(n-1);

        // HOrizontal
        int fnm2= TilingProb(n-2);

        // total ways
        int total = fnm1+fnm2;
        
        return total;
    }    
    public static void main(String[] args) {
        System.out.println(TilingProb(0));
    }
}
