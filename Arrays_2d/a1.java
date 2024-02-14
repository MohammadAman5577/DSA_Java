// creating a 2D-array
package Arrays_2d ;
import java.util.*;

public class a1 {
    public static void main(String argsp[]){
        int matrix[][]= new int[3][3];
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
        
       
    }
}

