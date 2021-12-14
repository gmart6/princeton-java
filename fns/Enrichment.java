import java.util.Arrays;

public class Enrichment {
    public static int lg(int n) {
        int num = 1;
        int i = 0;
        while (num <= n) {
            num *= 2;
            if (num > n) break;
            i++;
        }

        return i;
    }

    // Better solution
    // public static int lg(int N) {
    //   int x = 0;
    //   for (int n = N; n > 1; n/= 2) x++;
    //   return x;
    // }

    public static int[] histogram(int[] a, int m) {
        int[] hist = new int[m];

        for (int i = 0; i < m; i++) {
            hist[a[i]]++;
        }

        return hist;

    }

    public static void fourier(int N) {
        StdDraw.setScale(-10, 10);

        for (int i = 0; i < N; i++) {
            
        }

        for (int t = 0, t <n;
        t++){

        }

    }


    public static void main(String[] args) {

        // For lg method
        int n = Integer.parseInt(args[0]);

        System.out.println(lg(n));

        // For histogram method
        int[] arr = {2, 4, 4, 1, 0};
        int num = 5;

        System.out.println(Arrays.toString(histogram(arr, num)));
    }
}
