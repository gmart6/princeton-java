public class Problemo3 {
    public static int mystery(int a, int b) {
        if (a * b == 0) {
            return a;
        } else {
            int myst_rest = mystery(a - 1, b - 2);
            return b + myst_rest;
        }
    }

    public static void main(String[] args) {
        System.out.println(mystery(-1, -2));
    }
}
