package basic.exercise;


public class Ex_1_1_14 {

    public static void main(String[] args) {
        System.out.println(lg(8) == 3);
        System.out.println(lg(15) == 3);

        System.out.println(lg(16) == 4);
        System.out.println(lg(31) == 4);

        System.out.println(lg(32) == 5);
        System.out.println(lg(63) == 5);

        System.out.println(lg(64) == 6);
        System.out.println(lg(127) == 6);

        System.out.println(lg(128) == 7);
        System.out.println(lg(255) == 7);


        System.out.println(lg(256) == 8);
        System.out.println(lg(512) == 9);
        System.out.println(lg(1024) == 10);
    }

    /**
     * returns the largest int not larger than the base-2 logarithm of N.
     */
    public static int lg(int N) {
        int x = 0;
        for (int n = N; n > 1; n/=2) x++;
        return x;
    }
}
