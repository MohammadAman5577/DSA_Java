import java.util.*;
//code to check WHETHER A NO IS A MULTIPLE OF 10 
public class Break {
    public static void main(String args[]){
          Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Enter any number");

                int n= sc.nextInt();
                if(n%10==0){
                break;
                }
                System.out.println(n);
    }
        while(true);
        
        }
}
        
        

