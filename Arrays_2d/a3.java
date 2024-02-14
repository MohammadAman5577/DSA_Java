// Spiral Matrix
// j for column and i for row

// this code is also valid for N * M matrix
package Arrays_2d;

public class a3 {
    public static void printSpiral(int matrix[][]){
        int startRow=0;
        int startCol=0;
        int endRow=matrix.length-1;
        int endCol=matrix.length-1;

        while( startRow <= endRow && startCol <= endCol){
            //har case me <= is leiye aa raha hai kyouki odd matix order  ke case me
            // SR<ER && SC<EC  rakhte to outer boundary to cover ho jaati lekin beech wala choot jata
            // and (&&) condition is liye likhi gayi hai kyouki agar koi non squre matrix aa jati to
            // to humara loop zyada baar chalta aur befaaltu ki no's bhi print ho jaate     

            //top
            for(int j=startCol; j<=endCol;j++){
                System.out.print(matrix[startRow][j]+ " ");
            }
            //Right
            for(int i=startRow+1;i<=endRow;i++){
                System.out.print(matrix[i][endCol]+" ");
            }
            //Bottom
            for(int j=endCol-1;j>=startCol;j--){
                // agar humare rows zyada hia to jaise hi humare columns khatam ho jaayyenge to 
                //humara loop rukne wala hai , isse bachne ke liye hum columns me condition laga denge
                
                if(startCol== endCol){
                    break;
                }
                System.out.print(matrix[endRow][j]+" ");
            }
            //left
            for(int i=endRow-1;i>=startRow+1;i--){
               // ye codition is liye likhi gayi hai kyouki agar ek hi element vacha jai to hume
               // neeche aur bagal wali cheeze phir se na print karwani pade
                if (startRow==endRow){
                break;
               }
                System.out.print(matrix[i][startCol]+" ");
            }

            startCol++;
            startRow++;
            endCol--;
            endRow--;
        }
        System.out.println();
    }
    public static void main(String args[]){
        int matrix[][]= {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};

        printSpiral(matrix);                     
    }

}
