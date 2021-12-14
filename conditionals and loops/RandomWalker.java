public class RandomWalker {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        double moves = 0;
        double trials = 10000;

        for (int i = 0; i < trials; i++) {
            int x = n;
            int y = n;
            while (x != 0 && y != 0 && x != 2 * n && y != 2 * n) {
                double direction = Math.random();
                if (direction >= 0 && direction < .25) x++;
                else if (direction >= .25 && direction < .5) x--;
                else if (direction >= .5 && direction < .75) y++;
                else if (direction >= .75 && direction < 1) y--;

                moves++;
            }
        }

        double avgMoves = moves / trials;

        System.out.println(Math.round(avgMoves) + " move(s) on average");

    }
}
