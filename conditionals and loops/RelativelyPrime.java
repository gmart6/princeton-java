public class RelativelyPrime {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        System.out.print("  ");

        for (int i = 1; i <= n; i++) {
            System.out.print(i + "  ");
        }
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");

            for (int j = 1; j <= n; j++) {

                boolean star = true;

                for (int ii = 2; ii <= i; ii++) {
                    if (i % ii == 0 && j % ii == 0) {
                        star = false;
                    }
                }
                if (star) System.out.print("*  ");
                else System.out.print("   ");
            }
            System.out.println();
        }
    }
}
