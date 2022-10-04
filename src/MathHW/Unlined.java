package MathHW;

public class Unlined {
    public static void main(String[] args) {
        System.out.println("Внимание!\nНекоторые действия для определения выполнимости задачи и \nграфического определения максимумов и минимумов точек х и у были сделаны вне программы");
        thisSh(0.0001);
    }

    public static double urx(double y1) {
        return -Math.cos(y1 - 2) - 0.5;
    }

    public static double ury(double x1) {
        return Math.sin(x1 + 2) - 1.5;
    }

    public static void thisSh(double e) {
        double xmin = -0.5;
        double xmax = 1.5;
        double ymin = -2.5;
        double ymax = -0.5;
        int iter = 0;
        double x = (xmax - xmin) / 2 + xmin;
        double y = (ymax - ymin) / 2 + ymin;

        System.out.println("x0 = " + x + "\ny0 = " + y);
        while (true) {
            double x1 = urx(y);
            double y1 = ury(x);
            iter++;
            System.out.println("итерация " + iter + "\nx = " + x1 + "\ny = " + y1);
            if (Math.abs(x - x1) < e && Math.abs(y - y1) < e) {
                x = x1;
                y = y1;
                break;
            } else {
                x = x1;
                y = y1;
            }

        }

        System.out.println("приблизительные корни уравнения равны: \nx = " + x + "\ny = " + y);
    }
}

