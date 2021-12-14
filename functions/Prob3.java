public class Prob3 {
    public static int indexOf(int[] arr1, int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0, testI = i; j < arr1.length && testI < arr2.length; j++, testI++) {
                if (arr2[testI] != arr1[j]) {
                    break;
                } else if (j == arr1.length - 1) {
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] list1 = {1, 3, 6};
//        int[] list2 = {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 6, 9, 1, 3, 6};
        int[] list2 = {1, 3, 5, 8, 12, 1, 3, 17, 1, 3, 5, 9, 1, 3, 5};


        System.out.println(indexOf(list1, list2));
    }


}
