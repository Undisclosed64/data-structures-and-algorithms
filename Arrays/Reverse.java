import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        reverse(arr);
    }

    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
