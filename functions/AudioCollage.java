public class AudioCollage {
    public static double[] amplify(double[] a, double alpha) {
        double[] ampA = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            ampA[i] = a[i] * alpha;
        }

        return ampA;
    }

    public static double[] reverse(double[] a) {
        double[] revA = new double[a.length];

        for (int i = 0; i < a.length; i++) {
            revA[i] = a[a.length - 1 - i];
        }

        return revA;
    }

    public static double[] merge(double[] a, double[] b) {
        double[] merged = new double[a.length + b.length];

        for (int i = 0; i < a.length; i++) {
            merged[i] = a[i];
        }

        for (int i = 0; i < b.length; i++) {
            merged[i + a.length] = b[i];
        }

        return merged;
    }

    public static double[] mix(double[] a, double[] b) {
        int max = a.length;
        int min = b.length;
        double[] maxArr = a;
        double[] minArr = b;

        if (b.length > a.length) {
            max = b.length;
            min = a.length;
            maxArr = b;
            minArr = a;
        }

        double[] mixed = new double[max];

        for (int i = 0; i < max; i++) {
            mixed[i] = maxArr[i];
        }

        for (int i = 0; i < min; i++) {
            mixed[i] += minArr[i];
        }

        return mixed;
    }

    public static double[] changeSpeed(double[] a, double alpha) {
        double[] sped = new double[(int) (a.length / alpha)];

        for (int i = 0; i < sped.length; i++) {
            sped[i] = a[(int) (i * alpha)];
        }

        return sped;
    }

    public static void main(String[] args) {
        String file1 = "beatbox.wav";
        String file2 = "buzzer.wav";
        String file3 = "chimes.wav";
        String file4 = "cow.wav";
        String file5 = "dialup.wav";

        double[] sample1 = StdAudio.read(file1);
        double[] sample2 = StdAudio.read(file2);
        double[] sample3 = StdAudio.read(file3);
        double[] sample4 = StdAudio.read(file4);
        double[] sample5 = StdAudio.read(file5);

        double[] collage = merge(merge(merge(merge(sample1, sample2), sample3), sample4), sample5);

        collage = amplify(collage, 1.1);
        collage = reverse(collage);
        collage = mix(collage, sample1);
        collage = changeSpeed(collage, 2.7);

        StdAudio.play(collage);

    }
}
