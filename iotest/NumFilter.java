public class NumFilter {
    public static void main(String[] args) {
        int val = StdIn.readInt();
        int prevVal = val;

        StdOut.print(val + " ");

        while (!StdIn.isEmpty()) {
            val = StdIn.readInt();
            if (val != prevVal) StdOut.print(val + " ");
            prevVal = val;
        }
    }
}
