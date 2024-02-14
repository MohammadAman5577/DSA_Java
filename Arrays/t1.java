package Arrays;

// basics of array ie input and output and ubdating
import java.util.*;
public class t1 {
    public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    int marks[]=new int[100];
    System.out.println("Enter the marks of Phy,chem and maths");
    marks[0]=sc.nextInt();// phy 
    marks[1]=sc.nextInt();// chem
    marks[2]=sc.nextInt();// maths
    System.out.println("Phy : "+marks[0]);
    System.out.println("Chem : "+marks[1]);
    System.out.println("Maths : "+marks[2]);

    //ubdated
    
    marks[2]=marks[2]+marks[1];
    System.out.println("maths"+marks[2]);
    
    }
}
