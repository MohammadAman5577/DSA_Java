package Function;

import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number to check whether it is palindrome or not");
        int num = sc.nextInt();
    
        int rev=0;
        int temp = num;

        while(num>0){
            rev=rev*10;
            rev= rev + num%10;
            num=num/10;
        }
        if (rev == temp){
            System.out.println(true+"  Palindrome");
        }
        else{
            System.out.println(false+"   Not Palindrome");
        }
    }
    
}
