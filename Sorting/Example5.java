
import java.util.Arrays;
public class Example5 {
        public static void printArr(int arr[]){
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        
        //Inbuilt sorting with indexes
        
        Arrays.sort(arr,0,3);
        printArr(arr);
        
    }
}
