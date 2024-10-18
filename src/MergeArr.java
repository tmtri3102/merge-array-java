import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {1,2,3,4,5,6};

        int size = arr1.length + arr2.length;
        int[] arr3 = new int[size];
        for (int i = 0; i < arr1.length; i++) {
            arr3[i] = arr1[i];
        }
        for (int i = arr1.length; i < arr3.length; i++) {

            arr3[i] = arr2[i - arr1.length];
        }
        System.out.println(Arrays.toString(arr3));
    }
}
