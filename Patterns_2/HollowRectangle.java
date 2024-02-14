package Patterns_2;

public class HollowRectangle {
    public static void Hollow_Revtangle(int totRows,int totColms){
        //outer loop
        for(int i=1;i<=totRows;i++){

            //inner loop me columns 
            for(int j=1;j<=totColms;j++){
                //cell no =(i,j)

                if( i ==1 || i== totRows || j==1 || j== totColms){
                    //boudnary cells
                    System.out.print("*");
                

                }
                else{
                    System.out.print(" ");
                }
              

            }
            System.out.println();
            
        }
    }
    public static void main(String args[]){
        Hollow_Revtangle(10, 12);

    }
}
