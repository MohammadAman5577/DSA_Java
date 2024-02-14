package Function;

public class ProductOfAandB {
    public static int multiply ( int a, int b){ 
        int product = a*b;
        return product;

    }
   public static void main (String args[]){
    int a =3;
    int b =5;
    int prod= multiply(a,b);
    System.out.println(prod);
    
    prod =multiply(4,4);
    System.out.println(prod);
    
    int aman =multiply(100,50);
    System.out.println(aman);

      prod =multiply(7,7);
    System.out.println(prod);

      prod =multiply(9,9);
    System.out.println(prod);
   } 
    
}
