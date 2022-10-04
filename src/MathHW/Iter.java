package MathHW;

public class Iter {
    public static void main(String[] args) {
        System.out.println("Внимание!\nНекоторые действия для определения выполнимости задачи и \nграфического определения максимумов и минимумов точек х были сделаны вне программы");
        iterational(0.0001);
    }

    public static double fun(double x){
        return Math.sqrt(3.5-x*x*x)/3;
    }

    public static void iterational(double e){
        double x = 0.5;

        int counter = 0;
        while (true){
            double x1 = fun(x);

            counter++;
            System.out.println("итерация "+counter+"\nx = "+x1);

            if (Math.abs(x1-x)<e){
                x=x1;
                System.out.println("кол-во итераций: "+counter);
                System.out.println("ответ x = "+x);
                break;
            }else {
                x=x1;
            }
        }
    }
}
