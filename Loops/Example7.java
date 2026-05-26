// public class Example7 {
//     public static void main(String[] args) {
//         int n = 22082005;
//         while(n>0){
//         int lastDigit = n % 10;
//         System.out.print(lastDigit + " ");
//         n/=10;
//         }
//     }
// }

public class Example7{
    public static void main(String[] args) {
        for(int n = 22082005;n>0;n/=10){
            int lastDigit = n % 10;
            System.out.print(lastDigit+" ");
        }
    }
}
