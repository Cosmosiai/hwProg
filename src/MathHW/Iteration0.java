package MathHW;

import java.util.Scanner;

public class Iteration0 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        newMatrix(3);
    }
    public static double[][] newMatrix(int size){
        double[][] a = new double[size][size];
        int count = 0;
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){

                if (j==0){
                    System.out.println("Введите число без х");
                    double b = sc.nextDouble();
                    a[i][j]=b;
                }else {
                    if (count!=i) {
                        System.out.println("Введите число x"+(count+1));
                        double b = sc.nextDouble();
                        a[i][j]=b;
                    }else {
                        System.out.println("Введите число x"+(count+1));
                        double b = sc.nextDouble();
                        a[i][j]=b;
                    }
                    count++;
                    if(count==size-1){
                        count=0;
                    }
                }

            }
        }
        return a;
    }
}
