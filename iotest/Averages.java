public class Averages {
    public static void main(String[] args) {
        double magnitude = 0;
        double power = 0;
        int zeroCrossings = 0;
        int counter = 1;

        double prevVal = StdIn.readDouble();
        if (prevVal > -1 && prevVal < 1) {
            magnitude += Math.abs(prevVal);
            power += prevVal * prevVal;
        }

        while (!StdIn.isEmpty()) {
            double val = StdIn.readDouble();

            if (val > -1 && val < 1) {
                magnitude += Math.abs(val);
                power += val * val;

                if (val > 0) {
                    if (prevVal < 0) zeroCrossings++;
                } else if (val < 0) {
                    if (prevVal > 0) zeroCrossings++;
                }

                counter++;
                prevVal = val;
            }

        }
        StdOut.println("average magnitude: " + (magnitude / counter));
        StdOut.println("average power: " + (power / counter));
        StdOut.println("zero crossings: " + zeroCrossings);
    }
}
