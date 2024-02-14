// Code for searching  an Element in an array
package Arrays_2d;

import java.util.Scanner;

public class a2 {
    public static boolean Search(int matrix[][], int key){
        for(int i=0; i<matrix.length;i++){
            for(int j=0; j<matrix[0].length;j++){
                if(matrix[i][j]== key){
                    System.out.println("Found at cell: "+"("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("Element not found");
        return false;
        
    }
    public static void main(String argsp[]){
        int matrix[][]= new int[3][3];
        System.out.println("Enter the 9 elements of the matrix :");
        int n = matrix.length, m=matrix[0].length; // n means row, and m means column
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                matrix[i][j]= sc.nextInt();
            }

        }
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+ " ");
                
            }
            System.out.println();

        }

        Search(matrix, 4);
        
       
    }
    
}
