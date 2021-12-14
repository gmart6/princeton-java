public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int tmLength = 2;
        int iterations = 1;
        while (n > tmLength) {
            tmLength *= 2;
            iterations++;
        }

        int[] arr = new int[tmLength];
        arr[0] = 0;

        for (int i = 1; i <= iterations; i++) {
            for (int j = (int) (Math.pow(2, (i - 1))); j < (Math.pow(2, (i))); j++) {

                if (arr[j - ((int) (Math.pow(2, (i - 1))))] == 0) {
                    arr[j] = 1;
                } else {
                    arr[j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) System.out.print("+  ");
                else System.out.print("-  ");
            }
            System.out.println();
        }

    }
}
