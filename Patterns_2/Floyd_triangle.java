package Patterns_2;

public class Floyd_triangle {
    public static void Function(int n){
        int counter=1;
        for(int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String args []){
        Function(5);
    }
}
