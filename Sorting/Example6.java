
import java.util.Arrays;
import java.util.Collections;

public class Example6 {

    public static void printArr(Integer arr[]){
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {2,3,1,5,4};
        Arrays.sort(arr,Collections.reverseOrder());

        printArr(arr);
    }
}
