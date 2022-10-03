package MathHW;

import java.util.Scanner;

public class Iteration0 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double[][] a = {
                {2.7,0.22,-0.11,0.31},
                {-1.5,0.38,-0.12,0.22},
                {1.2,0.11,0.23,-0.51},
                {-0.17,0.17,-0.21,0.31}
        };
        iterations(a,0,0,0,0,0.001,0);
//        zeidel(a,0,0,0,0,0.001,0);
    }


    public static void iterations(double[][] a, double x1, double x2, double x3, double x4, double check, int counter){
        double x11 = a[0][0]+a[0][1]*x2+a[0][2]*x3+a[0][3]*x4;
        double x12 = a[1][0]+a[1][1]*x1+a[1][2]*x3+a[1][3]*x4;
        double x13 = a[2][0]+a[2][1]*x1+a[2][2]*x2+a[2][3]*x4;
        double x14 = a[3][0]+a[3][1]*x1+a[3][2]*x2+a[3][3]*x3;

        System.out.println("# "+counter);
        System.out.println(a[0][1]+" * "+x2+" + "+a[0][2]+" * "+x3+" + "+a[0][3]+" * "+x4+" + "+a[0][0]+" = "+x11+"\n" +
                           a[1][1]+" * "+x1+" + "+a[1][2]+" * "+x3+" + "+a[1][3]+" * "+x4+" + "+a[1][0]+" = "+x12+"\n" +
                           a[2][1]+" * "+x1+" + "+a[2][2]+" * "+x2+" + "+a[2][3]+" * "+x4+" + "+a[2][0]+" = "+x13+"\n" +
                           a[3][1]+" * "+x1+" + "+a[3][2]+" * "+x2+" + "+a[3][3]+" * "+x3+" + "+a[3][0]+" = "+x14+"");
        if((x1-x11)<=check&&(x2-x12)<=check&&(x3-x13)<=check&&(x4-x14)<=check){
            System.out.println("метод итерации");
            System.out.println("x1 = "+x11+", x2 = "+x12+", x3 = "+x13+", x4 = "+x14);
            System.out.println("количество итераций: "+counter);
        }else {
            counter++;
            iterations(a, x11, x12, x13, x14, check, counter);
        }
    }

    public static void zeidel(double[][] a, double x1, double x2, double x3, double x4, double check, int counter){
        double x11 = a[0][0]+a[0][1]*x2+a[0][2]*x3+a[0][3]*x4;
        double x12 = a[1][0]+a[1][1]*x11+a[1][2]*x3+a[1][3]*x4;
        double x13 = a[2][0]+a[2][1]*x11+a[2][2]*x12+a[2][3]*x4;
        double x14 = a[3][0]+a[3][1]*x11+a[3][2]*x12+a[3][3]*x13;

        System.out.println("# "+counter);
        System.out.println(a[0][1]+" * "+x2+" + "+a[0][2]+" * "+x3+" + "+a[0][3]+" * "+x4+" + "+a[0][0]+" = "+x11+"\n" +
                a[1][1]+" * "+x11+" + "+a[1][2]+" * "+x3+" + "+a[1][3]+" * "+x4+" + "+a[1][0]+" = "+x12+"\n" +
                a[2][1]+" * "+x11+" + "+a[2][2]+" * "+x12+" + "+a[2][3]+" * "+x4+" + "+a[2][0]+" = "+x13+"\n" +
                a[3][1]+" * "+x11+" + "+a[3][2]+" * "+x12+" + "+a[3][3]+" * "+x13+" + "+a[3][0]+" = "+x14);
        if((x1-x11)<=check&&(x2-x12)<=check&&(x3-x13)<=check&&(x4-x14)<=check){
            System.out.println("метод зейделя");
            System.out.println("x1 = "+x11+", x2 = "+x12+", x3 = "+x13+", x4 = "+x14);
            System.out.println("количество итераций: "+counter);
        }else {
            counter++;
            iterations(a, x11, x12, x13, x14, check, counter);
        }
    }
}
