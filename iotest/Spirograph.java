public class Spirograph {
    public static void main(String[] args) {
        double R = Double.parseDouble(args[0]);
        double r = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);

        StdDraw.setXscale(-300, +300);
        StdDraw.setYscale(-300, +300);
        StdDraw.setPenColor(StdDraw.PINK);

        double x0 = (R + r) * Math.cos(0) - (r + a) * Math.cos(((R + r) / r) * 0);
        double y0 = (R + r) * Math.sin(0) - (r + a) * Math.sin(((R + r) / r) * 0);

        for (double t = 0.01; t < 100; t += 0.01) {
            double x1 = (R + r) * Math.cos(t) - (r + a) * Math.cos(((R + r) / r) * t);
            double y1 = (R + r) * Math.sin(t) - (r + a) * Math.sin(((R + r) / r) * t);
            StdDraw.line(x0, y0, x1, y1);
            x0 = x1;
            y0 = y1;
        }

    }
}
