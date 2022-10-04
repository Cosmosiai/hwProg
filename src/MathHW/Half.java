package MathHW;

public class Half {
    public static void main(String[] args) {
        half(0, 1, 0.0001);
    }

    public static void half(double a, double b, double e) {
        int counter = 0;

        while (Math.abs(b - a) > e) {
            double fa = num10(a);
            double fb = num10(b);
            double c = (a + b) / 2;
            double fc = num10(c);
            counter++;
            if (fc == 0) {
                a = c;
                b = c;
            }
            if (fa * fc > 0) {
                a = c;
            }
            if (fb * fc > 0) {
                b = c;
            }
            System.out.printf("Номер итерации %d\n", counter);
            System.out.printf("a = " + a + ",\nb = " + b + "\n");


        }
        double root = (b + a) / 2;
        double froot = num10(root);
        System.out.println("Корень равен " + root);
        System.out.println("число итераций: " + counter);
        System.out.println("функция корневой точки " + froot);
    }

    public static double num10(double a) {
        return Math.pow(a, 3) + 3 * Math.pow(a, 2) - 3.5;
    }
}
