public class DiscreteDistribution {
    public static void main(String[] args) {
        int[][] arguments = new int[args.length][2];
        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            arguments[i][0] = i;
            arguments[i][1] = Integer.parseInt(args[i]);
            sum += arguments[i][1];
        }

        int r = (int) (sum * Math.random());

        int rollingSum = 0;
        for (int i = 0; i < arguments.length; i++) {
            rollingSum += arguments[i][1];
            if (rollingSum >= r) {
                System.out.println(i);
                break;
            }
        }


    }
}
