public class RightTriangle {
    public static void main(String[] args) {
        int side1 = Integer.parseInt(args[0]);
        int side2 = Integer.parseInt(args[1]);
        int side3 = Integer.parseInt(args[2]);

        boolean arePositive = (side1 > 0 && side2 > 0 && side3 > 0);

        double min = Math.min(Math.min(side1, side2), side3);
        double max = Math.max(Math.max(side1, side2), side3);
        double median = side1 + side2 + side3 - min - max;

        boolean isRightTriangle = (min * min + median * median == max * max);

        System.out.println(arePositive && isRightTriangle);
    }
}
