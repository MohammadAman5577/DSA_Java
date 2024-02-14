package Function;

public class BinomialCoefficient  {
    public static int factorial(int a){
        int f=1;

        for (int i=1;i<=a;i++){
            f=f*i;
        }
        return f ; 

    }

    public static int bincoeff(int n,int r){
        int n_fact= factorial(n);
        int r_fact= factorial(r);
        int nmr_fact= factorial(n-r);

        int bincoeff=n_fact/(r_fact*nmr_fact);
        return bincoeff ;
    }
    public  static void main(String args[]){
        System.out.println(bincoeff(9,8));
    }
    
}

 