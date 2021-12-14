public class FindDupe {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};

        int n = nums.length;

        boolean hasDupes = false;

        outerloop:
        for (int i = 0; i < n; i++) {
            int current = nums[i];
            for (int j = i; j < n - 1; j++) {
                if (current == nums[j + 1]) {
                    hasDupes = true;
                    break outerloop;
                }
            }
        }

        System.out.println(hasDupes);
    }
}
