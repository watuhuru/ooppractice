package practice1;

public class HarmonicSeries {
    public static void main(String[] args) {
        double harmonicNumber = 0.0;

        System.out.printf("%3s %12s %22s%n", "n", "1/n", "H(n)");
        for (int n = 1; n <= 10; n++) {
            double term = 1.0 / n;
            harmonicNumber += term;
            System.out.printf("%3d %12.4f %22.4f%n", n, term, harmonicNumber);
        }
    }
}

