public class WorldMap {
    public static void main(String[] args) {
        int w = StdIn.readInt();
        int h = StdIn.readInt();

        StdDraw.setCanvasSize(w, h);
        StdDraw.setXscale(0, w);
        StdDraw.setYscale(0, h);
        StdDraw.enableDoubleBuffering();

        while (!StdIn.isEmpty()) {
            String state = StdIn.readString();

            int vertices = StdIn.readInt();

            double[] xCoords = new double[vertices];
            double[] yCoords = new double[vertices];

            for (int i = 0; i < vertices; i++) {
                xCoords[i] = StdIn.readDouble();
                yCoords[i] = StdIn.readDouble();
            }

            StdDraw.polygon(xCoords, yCoords);
        }

        StdDraw.show();
    }
}
