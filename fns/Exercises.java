public class Exercises {
    public static boolean majority(boolean a, boolean b, boolean c) {
        return (a && b) || (a && c) || (b && c);
    }

    public static boolean eq(int[] a, int[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static double sqrt(double c) {
        double epsilon = 1.0e-15;
        double t = c;

        while (Math.abs(t - c / t) > epsilon * t) {
            t = (c / t + t) / 2.0;
        }

        return t;
    }
}
