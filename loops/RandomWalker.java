public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int d = 0;
        double step;
        int stepCount = 0;
        System.out.println("(" + x + "," + " " + y + ")");

        while (d != r) {
            step = Math.random();
            if (step >= 0 && step < 0.25) x++;
            else if (step >= 0.25 && step < 0.5) x--;
            else if (step >= 0.5 && step < 0.75) y++;
            else if (step >= 0.75 && step < 1) y--;
            stepCount++;
            System.out.println("(" + x + "," + " " + y + ")");

            if (Math.abs(x) + Math.abs(y) >= r) {
                System.out.println("steps = " + stepCount);
                break;
            }

        }
    }
}
