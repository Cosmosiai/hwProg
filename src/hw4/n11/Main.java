package hw4.n11;

import com.sun.management.HotSpotDiagnosticMXBean;
import hw4.n11.Liability.Professional;
import hw4.n11.Property.Property;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("выберите вид страхования \n1 - личное страхование\n2 - страхование ответственности \n3 - страхование имущества");
        int a  = sc.nextInt();
        switch (a){
            case 1:
                System.out.println("выберите вид личного страхования\n1 - страхование здоровья");
                int b = sc.nextInt();
                switch(b){
                    case 1:
                        Professional pro = null;
                        pro.howMuchPay();
                        break;
                }
                break;
            case 2:
                System.out.println("выберите вид страхования страхования ответственности\n1 - профессиональное страхование");
                b = sc.nextInt();
                switch(b){
                    case 1:
                        Professional pro = new Professional();
                        pro.howMuchPay();
                        break;
                }
                break;
            case 3:
                System.out.println("выберите вид страхования имущества\n1 - жилищное страхование");
                b = sc.nextInt();
                switch(b){
                    case 1:

                }
                break;
                
        }

    }
}
