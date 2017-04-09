package basic;

import edu.princeton.cs.algs4.StdOut;

public class Exercises {
    public static void main(String[] args) {
        StdOut.printf("%.5s\n","Hello, World");
        StdOut.printf("PI is approcimately %.2f\n",Math.PI);
        System.out.printf("PI is approcimately %.2f\n",Math.PI);
        System.out.printf("%14d\n",512);
        System.out.printf("%-14d\n",512);
        System.out.printf("%14.4e\n",1598.1234567876423577D);
        System.out.printf("%14.2f\n",1598.1234567876423577D);
        System.out.printf("%.7f\n",1598.1234567876423577D);

//        StdDraw.point(0.5,0.5);
//        StdDraw.line(0.2,0.4,0.4,0.7);
//        StdDraw.circle(0.5,0.6,0.3);
//        StdDraw.square(0.2,0.2,0.1);

        System.out.println((0 + 15) / 2);
        System.out.println(2.0e-6 * 100000000.1);
        System.out.println(true && false || true && true);

        double x = (1 + 2.236) / 2;
        System.out.println( 1 + 2 + 3 + 4.0);
        System.out.println(4.1 >= 4);
        System.out.println(1  +"3" + 2);


//        Fibonacci(15);

        /*double t = 9.0;
        while (Math.abs(t - 9.0/t) > .001){
            t = (9.0/t + t) /2.0;
            StdOut.printf("%.5f\n",t);
        }
        StdOut.printf("%.5f\n",t);*/


        int sum = 0;
        for (int i = 1; i < 1000; i*=2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        StdOut.println(sum);

        System.out.println('b');
        System.out.println('b' + 'c');
        System.out.println((char)('a' + 4));
        System.out.println(Integer.toBinaryString(9));

        boolean[][] barr = {
                {true,false,true,false,true,true,true},
                {true,false,true,false,true}};

        printTwoDimensionBooleanArray(barr) ;





    }

    private static  void printTwoDimensionBooleanArray(boolean[][] barr) {
        for (int i = 0; i < barr.length; i++) {
            for (int j = 0; j < barr[i].length; j++) {
                System.out.printf("%2s", barr[i][j] ? "*" : "_");
            }
            System.out.println();
        }
    }



    public  static String exR1(int n){
        if(n <= 0) return "";
        return exR1(n - 3) + n + exR1(n - 2) + n;
    }



}
