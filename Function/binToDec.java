package Function;

public class binToDec {
    public static void bin_To_Dec(int binNum){
        int myNum = binNum ;
        int pow =0;
        int decNum= 0;
        while(binNum>0){
            int lastDigit=binNum%10;
            decNum=decNum+(lastDigit*(int)Math.pow(2,pow));
            pow++;
            binNum=binNum/10;
        }
        System.out.println("Decimal of "+myNum+"="+decNum);
    }
    public static void main(String args[]){
        bin_To_Dec(1001);
    }
}
