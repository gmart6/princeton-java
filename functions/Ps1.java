import java.util.Arrays;

public class Ps1 {
    public static void main(String[] args) {
        int[] a = {5, 4, 3, 2, 1};
        int[] b = {5, 4, 3, 2, 1};
        int[] c = a;

        for (int i = 0; i < b.length; i++) {
            c[i] = b[i];
        }

        b[3] += b.length;
        a[3]--;

        System.out.println(a[3] + " " + b[3] + " " + c[3]);

        System.out.println("a: " + Arrays.toString(a));
        System.out.println("b: " + Arrays.toString(b));
        System.out.println("c: " + Arrays.toString(c));


    }
}
