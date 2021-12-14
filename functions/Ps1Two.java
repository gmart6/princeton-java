import java.util.Arrays;

public class Ps1Two {
    public static void shiftRight(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("array cannot be null.");
        }
        if (arr.length > 1) {
            int last = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }
    }

    public static void main(String[] args) {
        int[] values = {0, 2, 4, 6, 8, 10, 14, 12};
        shiftRight(values);
        System.out.println(Arrays.toString(values));
    }

}
