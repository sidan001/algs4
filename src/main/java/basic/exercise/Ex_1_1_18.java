package basic.exercise;


public class Ex_1_1_18 {

    public static void main(String[] args) {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));

        System.out.println(mystery1(2, 25));
        System.out.println(mystery1(3, 11));

    }

    // return a * b
    public static int mystery(int a, int b) {
        if( b == 0) return 0;
        if(b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }


    //return a 的 b 次方
    public static int mystery1(int a, int b) {
        if( b == 0) return 1;
        if(b % 2 == 0) return mystery1(a * a, b / 2);
        return mystery1(a * a, b / 2) * a;
    }

}
