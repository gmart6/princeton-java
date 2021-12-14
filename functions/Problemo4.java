public class Problemo4 {
    public static boolean search(Object item, Object[] arr, int start) {
        if (arr == null || item == null) {
            throw new IllegalArgumentException("arguments must not be null.");
        }

        if (arr[start].equals(item)) {
            return true;
        } else if (start == arr.length - 1) {
            return false;
        } else {
            return search(item, arr, start + 1);
        }
    }

    public static void main(String[] args) {

        Object[] arr = {1, 2, 3};

        System.out.println(search(2, arr, 2));
    }
}
