// Diagonal Sum

// Optimised code
package Arrays_2d;

public class a5 {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for (int i = 0; i< matrix.length; i++){
            // primary diagonal
            sum += matrix[i][i];

            // Secondary Diagonal

            // is conditio se middle wala number 2 times nhi add hoga ie for i not equal j
            if(i!= matrix.length-1-i){
                sum += matrix[i][matrix.length-i-1];
            }
            
        }
        return sum;
        
    }

    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

                     
    }

    
}
