package hw1;


    import java.io.PrintStream;
import java.util.Arrays;

    public class allPro {
        public allPro() {
        }

        public static void main(String[] args) {
            int[] a = new int[10];
            allNull(a);
            oneZero(a);
            notTwo(a);
            arProg(a, 1, 3);
            two(a);
            minusThree(a);
            arrFib(a);
            evens(a);
            compFunc(a);
            firstLast(a);
            sumProd(a);
            sumTwo(a);
            sumLess11(a);
        }

        public static void allNull(int[] a) {
            a[0] = 1;
            a[a.length - 1] = 1;
            System.out.println(Arrays.toString(a));
        }

        public static void oneZero(int[] a) {
            for(int i = 0; i < a.length; ++i) {
                if (i % 2 != 0) {
                    a[i] = 1;
                } else {
                    a[i] = 0;
                }
            }

            System.out.println(Arrays.toString(a));
        }

        public static void notTwo(int[] a) {
            int counter = 1;

            for(int i = 0; i < a.length; ++i) {
                a[i] = counter;
                counter += 2;
            }

            System.out.println(Arrays.toString(a));
        }

        public static void arProg(int[] a, int x, int d) {
            int counter = d;
            a[0] = x;

            for(int i = 1; i < a.length; ++i) {
                a[i] = a[i - 1] + d;
                counter += d;
            }

            System.out.println(Arrays.toString(a));
        }

        public static void two(int[] a) {
            int counter = 0;

            for(int i = 0; i < a.length; ++i) {
                a[i] = counter;
                counter += 2;
            }

            System.out.println(Arrays.toString(a));
        }

        public static void minusThree(int[] a) {
            int counter = 0;
            int minIndex = a.length - 1;

            for(int i = a.length - 1; i >= 0; --i) {
                a[i] = counter;
                counter += 3;
            }

            System.out.println(Arrays.toString(a));
        }

        public static void arrFib(int[] a) {
            a[0] = 1;
            a[1] = 1;

            for(int i = 2; i < a.length; ++i) {
                a[i] = a[i - 1] + a[i - 2];
            }

            System.out.println(Arrays.toString(a));
        }

        public static void evens(int[] a) {
            int counter = 0;

            for(int i = 0; i < a.length; ++i) {
                if (a[i] % 2 == 0) {
                    ++counter;
                }
            }

            PrintStream var10000 = System.out;
            String var10001 = Arrays.toString(a);
            var10000.println(var10001 + "\ncount of even numbers in array is " + counter);
        }

        public static void compFunc(int[] a) {
            int counter = 0;

            for(int i = 0; i < a.length; ++i) {
                if (a[i] % 3 == 0 && a[i] % 7 != 0) {
                    ++counter;
                }
            }

            PrintStream var10000 = System.out;
            String var10001 = Arrays.toString(a);
            var10000.println(var10001 + "\ncount of numbers in array,which can be divided on 3, but not 7, is " + counter);
        }

        public static void firstLast(int[] a) {
            int fcounter = 0;
            int lcounter = 0;
            int[] var3 = a;
            int var4 = a.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                int i = var3[var5];
                if (i % a[0] == 0) {
                    ++fcounter;
                }

                if (i % a[a.length - 1] == 0) {
                    ++lcounter;
                }
            }

            System.out.println(Arrays.toString(a) + "\ncount of numbers in array,which can be divided on first element is " + fcounter + "\ncount of numbers in array,which can be divided on last element is " + lcounter);
        }

        public static void sumProd(int[] a) {
            int sum = 0;
            int prod = 1;
            int[] var3 = a;
            int var4 = a.length;

            for(int var5 = 0; var5 < var4; ++var5) {
                int i = var3[var5];
                sum += i;
                prod *= i;
            }

            System.out.println(Arrays.toString(a) + "\nSum of numbers in array is " + sum + "\nProd of numbers in array is " + prod);
        }

        public static void sumTwo(int[] a) {
            int sum = 0;
            int[] var2 = a;
            int var3 = a.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                int i = var2[var4];
                if (i % 2 == 0) {
                    sum += i;
                }
            }

            PrintStream var10000 = System.out;
            String var10001 = Arrays.toString(a);
            var10000.println(var10001 + "\nSum of numbers in array, which can be devided on 2, is " + sum);
        }

        public static void sumLess11(int[] a) {
            int sum = 0;
            int[] var2 = a;
            int var3 = a.length;

            for(int var4 = 0; var4 < var3; ++var4) {
                int i = var2[var4];
                if (i % 2 != 0 && i < 11) {
                    sum += i;
                }
            }

            PrintStream var10000 = System.out;
            String var10001 = Arrays.toString(a);
            var10000.println(var10001 + "\nSum of numbers in array, which can't be devided on 2 and is less than 11, is " + sum);
        }
    }
