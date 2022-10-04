package MathHW;

public class Lab2 {
    public static void main(String[] args) {
//        ---------------------------------------------------------------
        double[][] arr = {
                {0.83, 2.18, -1.73, 0.28},
                {2.18, -1.41, 1.03, -1.18},
                {-1.73, 1.03, 2.27, 0.72},
        };
//        ----------------------------------------------------------------
        double t11 = Math.sqrt(arr[0][0]);
        double t12 = arr[0][1]/t11;
        double t13 = arr[0][2]/t11;
        double t22 = 0;
        boolean t22ComplexStatus = false;
        double t23 = 0;
        boolean t23ComplexStatus = false;
        double t33 = 0;
        boolean t33ComplexStatus = false;
//        --------------------------------------------------------------

        if ((arr[1][1] - Math.pow(t12, 2)) < 0) {
            t22 = Math.sqrt((arr[1][1] - Math.pow(t12, 2))*-1);
            System.out.println("Attention! t22 is a complex num!");
            t22ComplexStatus = true;
        } else {
            t22 = Math.sqrt(arr[1][1] - Math.pow(t12, 2));
        }

        if (t22ComplexStatus) {
            t23 = ((arr[1][2]-t12*t13)/t22)*-1;
            System.out.println("Attention! t23 is a complex num!");
            t23ComplexStatus = true;
        } else {
            t23 = (arr[1][2]-t12*t13)/t22;
        }

        if (t23ComplexStatus) {
            if ((arr[2][2] - Math.pow(t13, 2) + Math.pow(t23, 2)) < 0){
                t33 = Math.sqrt(Math.abs(arr[2][2] - Math.pow(t13, 2) - Math.pow(t23, 2)));
                System.out.println("Attention! t33 is a complex num! 1 case");
                t33ComplexStatus = true;
            } else {
                t33 = Math.sqrt(arr[2][2] - Math.pow(t13, 2) + Math.pow(t23, 2));
            }

        } else {
            if ((arr[2][2] - Math.pow(t13, 2) - Math.pow(t23, 2)) < 0){
                t33 = Math.sqrt(Math.abs(arr[2][2] - Math.pow(t13, 2) - Math.pow(t23, 2)));
                System.out.println("Attention! t33 is a complex num! 2 case");
                t33ComplexStatus = true;
            }
            else {
                t33 = Math.sqrt(arr[2][2] - Math.pow(t13, 2) - Math.pow(t23, 2));
            }
        }
//        -----------------------------------------------------------------------------------
        double y1 = arr[0][3]/t11;
        double y2 = 0;
        boolean y2ComplexStatus = false;
        double y3 = 0;
        boolean y3ComplexStatus = false;
        boolean y3DividedStatusCase1 = false;
        double y3DividedCase1Part1 = 0;
        double y3DividedCase1Part2 = 0;

        if (t22ComplexStatus) {
            y2 = ((arr[1][3] - t12 * y1) / t22 )* -1;
            System.out.println("Attention! y2 is a complex num!");
            y2ComplexStatus = true;
        } else {
            y2 = (arr[1][3] - t12 * y1) / t22;
        }
        if (t23ComplexStatus) {
            if (t33ComplexStatus){
                y3 = (arr[2][3] - t13 * y1 - (t23*y2 * -1)) / t33;
                System.out.println("Attention! y3 is a complex num here!");
                y3ComplexStatus = true;
            } else {
                System.out.println("y3: " + (arr[2][3] - t13*y1) / t33 + "i - " + t23*y2 / t33);
                System.out.println("Attention! y3 is a complex num!");
                y3DividedStatusCase1 = true;
                y3DividedCase1Part1 = (arr[2][3] - t13*y1) / t33;
                y3DividedCase1Part2 = t23*y2 / t33;
            }
        } else {
            if (t33ComplexStatus){
                y3 = ((arr[2][3] - t13*y1 - t23*y2) / t33) * -1;
                System.out.println("Attention! y3 is a complex num!");
                y3ComplexStatus = true;
            } else {
                y3 = (arr[2][3] - t13*y1 - t23*y2) / t33;
            }
        }
//-------------------------------------------------------------------------------------------------
        double x3 = 0;
        boolean x3ComplexStatus = false;
        double x2 = 0;
        boolean x2ComplexStatus = false;
        double x1 = 0;
        boolean x1ComplexStatus = false;

        if (t33ComplexStatus) {
            if (y3ComplexStatus){
                x3 = y3/t33;
            } else {
                x3 = y3/t33;
                x3ComplexStatus = true;
                System.out.println("Attention! x3 is a complex num!");
            }

        } else {
            if (y3ComplexStatus) {
                x3ComplexStatus = true;
                System.out.println("Attention! x3 is a complex num!");
                x3 = y3/t33;
            } else {
                x3 = y3/t33;
            }
        }

        x2 = (y2 - t23 * x3) / t22;

        x1 = (y1 - t12 * x2 - t13 * x3) / t11;

//        -------------------------------------------------------------------------------------

        System.out.println("t11: " + t11);
        System.out.println("t12: " + t12);
        System.out.println("t13: " + t13);

        System.out.println("t22: " + t22);
        System.out.println("t23: " + t23);

        System.out.println("t33: " + t33);

        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println("y3: " + y3);
        System.out.println("--------------------------------------------------------------");

        System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);
        System.out.println("x3: " + x3);


    }
}
