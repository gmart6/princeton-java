public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);

        int x = 0;
        int y = 0;
        int d = 0;
        double stepCount = 0;
        double step;

        for (int i = 0; i < trials; i++) {
            while (d != r) {
                step = Math.random();
                if (step >= 0 && step < 0.25) x++;
                else if (step >= 0.25 && step < 0.5) x--;
                else if (step >= 0.5 && step < 0.75) y++;
                else if (step >= 0.75 && step < 1) y--;
                stepCount++;

                if (Math.abs(x) + Math.abs(y) >= r) {
                    x = 0;
                    y = 0;
                    break;
                }
            }
        }

        System.out.println("average number of steps = " + stepCount / trials);
    }
}
