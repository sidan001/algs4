package basic.exercise;

/**
 * 编写一个机柜的静态方法计算 ln(N!)的值
 */
public class Ex_1_1_20 {

    public static int factorial(int n) {
        if (n < 1) return 0;

        if ( n == 1 ) {
            return 1;
        } else {
            return n * factorial(n -1);
        }
    }


    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(Math.log(factorial(5)));
    }
}
