public class ActivationFunction {
    public static double heaviside(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        else if (x < 0) return 0;
        else if (x == 0) return 0.5;
        else return 1;
    }

    public static double sigmoid(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        else return (1 / (1 + Math.pow(Math.E, -x)));

    }

    public static double tanh(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        else if (x >= 20) return 1.0;
        else if (x <= -20) return -1.0;
        else return ((Math.pow(Math.E, x) - Math.pow(Math.E, -x)) / (Math.pow(Math.E, x) + Math.pow(Math.E, -x)));
    }

    public static double softsign(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        else if (x == Double.POSITIVE_INFINITY) return 1;
        else if (x == Double.NEGATIVE_INFINITY) return -1;
        else return (x / (1 + Math.abs(x)));
    }

    public static double sqnl(double x) {
        if (Double.isNaN(x)) return Double.NaN;
        else if (x <= -2) return -1;
        else if (x < 0 && x > -2) return (x + ((x * x) / 4));
        else if (x >= 0 && x < 2) return (x - ((x * x) / 4));
        else return 1;
    }

    public static void main(String[] args) {
        double d = Double.parseDouble(args[0]);

        StdOut.println("heaviside(" + d + ") = " + heaviside(d));
        StdOut.println("  sigmoid(" + d + ") = " + sigmoid(d));
        StdOut.println("     tanh(" + d + ") = " + tanh(d));
        StdOut.println(" softsign(" + d + ") = " + softsign(d));
        StdOut.println("     sqnl(" + d + ") = " + sqnl(d));
    }
}
