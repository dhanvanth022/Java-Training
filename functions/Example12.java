// Covert Binary to Decimal numbers
public class Example12 {
    public static void binToDec(int binNum ){
        int mynum = binNum;
        int pow = 0;
        int decNum = 0;

        while(binNum>0){
            int LastDigit = binNum % 10;
            decNum = decNum + (LastDigit *  (int)Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.print("decimal of "+mynum+" = "+decNum);
    }
    public static void main(String[] args) {
        binToDec(101);
    }
}
