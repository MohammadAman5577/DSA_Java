package Recursion;
public class r0{
    public static void printDec(int number){
        if (number == 1 ){
            System.out.println(number);
            return;
    }
        System.out.println(number);
        printDec(number-1);
    }
     
 
    public static void main(String[] args) {
        int number=10;
        printDec(number);
    }
}

