public class RollLoadedDie {
    public static void main(String[] args) {
        double result = Math.random() * 8.0;

        if (result >= 6) {
            System.out.println(6);
        } else {
            System.out.println((int) result);
        }

    }
}
