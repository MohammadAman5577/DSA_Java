// printing 1 to 10 incresaing order
// from the previous ie r0 we have only changed the orderso in this 
// f(n)= f(n-1) + n;


//whereas in prev ques f(n)= n + f(n-1);
// this means only order was changed so in prev ques it was printing n to 0
package Recursion;
public class r1_new_method{
    public static void printDec(int number){
        if (number == 1 ){
            System.out.println(number);
            return;
    }
        
        printDec(number-1);
        System.out.println(number);
    }
     
 
    public static void main(String[] args) {
        int number=10;
        printDec(number);
    }
}

