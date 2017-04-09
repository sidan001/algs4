package basic.exercise;

/**
 * Created by chou on 2017/4/9.
 */
public class Ex_1_1_19 {

    private static long[] arr = new long[100];

    // fibonacci 第N个位置的数字，效率太低，每次都重新计算
    public static long F(int N){
        if (N ==0) return 0;
        if (N ==1) return 1;

        return F(N-1) + F(N -2);
    }

    //循环调用F1存储每次计算的值到数组中
    public static long F1(int N) {
        if (N == 0) {
            arr[0] = 0;
        } else if (N == 1) {
            arr[1] = 1;
        } else {
            arr[N] = arr[N-1] + arr[N-2];
        }
        return arr[N];
    }

    //打印斐波那契数列
    private static void fibonacci(int num) {
        int f = 0;
        int g = 1;

        for (int i = 0; i < num; i++) {
            System.out.printf("%d\t",f);
            f= f + g;
            g= f - g;
        }
    }

    public static void main(String[] args) {
//        fibonacci(47);

        for (int N = 0; N < 100; N++) {
            System.out.println(N + " " + F1(N));
        }
    }



}
