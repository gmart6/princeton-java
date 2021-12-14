/* *****************************************************************************
 *  Name:              Alan Turing
 *  Coursera User ID:  123456
 *  Last modified:     1/1/2019
 **************************************************************************** */

public class Exercises {
    public static int mystery(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery(a * a, b / 2);
        return mystery(a * a, b / 2) * a;
    }

    public static String ruler(int n) {
        if (n == 0) return " ";
        return ruler(n - 1) + n + ruler(n - 1);
    }

    public static void drawRuler(String s) {
        String[] arr = s.split(" ");
        StdDraw.setXscale(-1, arr.length - 1);

        for (int i = 1, j = 0; i < arr.length; i++, j++) {
            int d = Integer.parseInt(arr[i]);

            StdDraw.line(j, 0, j, d);
        }

    }

    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        StdDraw.setYscale(0, a + 1);
        // int b = Integer.parseInt(args[1]);

        // StdOut.println(mystery(a, b));
        String s = ruler(a);
        drawRuler(s);
    }
}
