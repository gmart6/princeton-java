public class Prob4 {
    public static boolean search(Object item, Object[] arr) {
        if (arr == null || item == null) {
            throw new IllegalArgumentException("arguments must not be null.");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(item)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        Object[] arr = {1, 2, 3};

        System.out.println(search(1, arr));
    }
}
