// print 1 to 10 increasing
package Recursion;
public class r1{
    public static void printDec(int number){
        if (number == 10 ){
            System.out.println(number);
            return;
    }
        System.out.println(number);
        printDec(number+1);
    }
     
 
    public static void main(String[] args) {
        int number=1;
        printDec(number);
    }
}

