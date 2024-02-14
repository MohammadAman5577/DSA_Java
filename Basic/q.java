public class q {
    public static void main(String args[]){
        char a='a';
        char b='b';
        //System.out.println(a);
      //  System.out.println((int)a);
       // System.out.println((int)b);
      //  System.out.println((int)(a-b));
       // System.out.println(a-b);
       // System.out.println(a);
        char c=(char) (a-b);
        System.out.println(c);
    }
    
}
// isme char a and char b ko pahle hi int me convert kar liya
//phir int se char me lossy conversion hua
