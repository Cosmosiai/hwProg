package MathHW;

import java.util.Arrays;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите первый ряд системы уравнений");
        String row1 = input.nextLine();
        System.out.println("Введите второй ряд системы уравнений");
        String row2 = input.nextLine();
        System.out.println("Введите третий ряд системы уравнений");
        String row3 = input.nextLine();
        System.out.println("Введите четвертый ряд системы уравнений");
        String row4 = input.nextLine();
        double[][] matrix = new double[4][5];
        matrix[0] = addRow(row1, matrix,0);
        matrix[1] = addRow(row2, matrix,1);
        matrix[2] = addRow(row3, matrix,2);
        matrix[3] = addRow(row4, matrix,3);

        matrix[0] = delenie(matrix,1);
        for (int i = 1; i < 4; i++) {
            matrix[i] = minus(matrix, 0,i,1);
            System.out.println(Arrays.toString(matrix[i]));
        }

        matrix[1] = delenie(matrix,2);
        for (int i = 2; i < 4; i++) {
            matrix[i] = minus(matrix, 1,i,2);
            System.out.println(Arrays.toString(matrix[i]));
        }

        matrix[2] = delenie(matrix,3);
        matrix[3] = minus(matrix, 2,3,3);
        System.out.println(Arrays.toString(matrix[0]));
        System.out.println(Arrays.toString(matrix[1]));
        System.out.println(Arrays.toString(matrix[2]));
        System.out.println(Arrays.toString(matrix[3]));

        double x4 = matrix[3][4]/matrix[3][3];
        double x3 = matrix[2][4]-(matrix[2][3]*x4);
        double x2 = matrix[1][4]-(matrix[1][3]*x4)-(matrix[1][2]*x3);
        double x1 = matrix[0][4]-(matrix[0][3]*x4)-(matrix[0][2]*x3)-(matrix[0][1]*x2);
        System.out.println("x1 = "+x1);
        System.out.println("x2 = "+x2);
        System.out.println("x3 = "+x3);
        System.out.println("x4 = "+x4);
    }
    static double[] addRow(String rows, double[][] matrix, int numRow){
        String[] strArr = rows.split(" ");
        Double b = 0.000;
        for (int j = 0; j < strArr.length; j++) {
            b = Double.valueOf(strArr[j]);
            matrix[numRow][j] = b;
        }
        return matrix[numRow];
    }

    static double[] delenie(double[][]matrix, int row){
        double x1 = matrix[row-1][row-1];
        for (int i = row-1; i < matrix[row-1].length; i++) {
            matrix[row-1][i] = matrix[row-1][i]/x1;
            matrix[row-1][i] = (int)(matrix[row-1][i]*1000);
            matrix[row-1][i] = matrix[row-1][i]/1000;
        }
        return matrix[row-1];
    }

    static double[] minus(double[][]matrix, int firstRow, int secondRow, int mainRow){
        int count=0;
        double[] cloneMatrix = Arrays.copyOf(matrix[firstRow], matrix[firstRow].length);
        for (double i:cloneMatrix) {
            cloneMatrix[count] = matrix[secondRow][mainRow-1] * i;
            count++;
        }
        count =0;
        for (double j:cloneMatrix){
            matrix[secondRow][count] =(int)((j-matrix[secondRow][count])*1000);
            matrix[secondRow][count] = matrix[secondRow][count]/1000;
            count++;
        }
        return matrix[secondRow];
    }
}
