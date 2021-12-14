public class LongestRun {
    public static void main(String[] args) {
        int longestRun = 1;
        int currRun = 1;
        int value = StdIn.readInt();
        int highestVal = value;

        while (!StdIn.isEmpty()) {
            int prevValue = value;
            value = StdIn.readInt();

            if (value == prevValue) {
                currRun++;
                if (currRun > longestRun) {
                    longestRun = currRun;
                    highestVal = value;
                }
            } else {
                currRun = 1;
            }
        }

        StdOut.println("Longest run: " + longestRun + " consecutive " + highestVal + "s.");
    }
}
