import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        int[] ints = new int[n - 1];

        // create array of input ints
        for (int i = 0; i < n - 1; i++) {
            ints[i] = StdIn.readInt();
        }

        // behavior check
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (ints[j] > n) {
                    StdOut.println("int(s) entered outside of boundary");
                    System.exit(-1);
                } else if (i == j) {
                    continue;
                } else if (ints[i] == ints[j]) {
                    StdOut.println("duplicate int(s) entered");
                    System.exit(-1);
                }
            }
        }

        Arrays.sort(ints);

        for (int i = 1; i < n - 1; i++) {
            if (ints[i] != ints[i - 1] + 1) StdOut.println("missing value: " + (ints[i] - 1));
        }


    }
}
