// Diagonal Sum

// brute force method
// O(n^2)
package Arrays_2d;

public class a4 {
    public static int diagonalSum(int matrix[][]){
        int sum=0;
        for(int i=0; i<matrix.length; i++){
            for(int j=0;j<matrix[0].length;j++){
                // for primary diagonal
                if(i == j){
                    sum += matrix[i][j];
                }
                else if( i+j == matrix.length-1){
                    sum+= matrix[i][j];
                }
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
