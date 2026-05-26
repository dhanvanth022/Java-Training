public class Example3 {
    public static int swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;
        return swap(a, b);

    }
    public static void main(String[] args) {
        int a = 5;
        int b =15;
        int swapp = swap(a, b);
        System.out.println("a = "+swapp);
        System.out.println("b = "+swapp);
    }
}
