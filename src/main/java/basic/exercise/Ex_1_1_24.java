package basic.exercise;

/**
 *
 * 余数公式 c = a- (a/b)*b 可推导出 欧几里得算法
 */
public class Ex_1_1_24 {

    public static void main(String[] args) {
        System.out.println(gcd(1_111_111, 1_234_567));

        System.out.println(gcd(18,12));
    }

    public static int gcd(int p, int q) {
        System.out.printf("p:%d  q:%d%n", p, q);
        if(q == 0) return p;
        int r = p % q;
        return gcd(q, r);
    }
}
