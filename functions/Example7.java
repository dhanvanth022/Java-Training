//function overloading: Multiple functions with the same name but different parameters.
public class Example7 {

    public static int sum(int a, int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3, 2));
        System.out.println(sum(10, 5, 7));
    }
}
