package basic.exercise;

import java.util.stream.IntStream;

/**
 * 跟踪二分查找的rank()方法调用，每当该方法被调用时，打印出它的参数lo和hi并按照递归的深度缩紧。
 */
public class Ex_1_1_22 {

    public static void main(String[] args) {
        int[] ints = IntStream.range(0, 10000).toArray();

        System.out.println(rank(1998, ints));
    }

    public static int  rank(int key, int[] ints) {
        return rank(key,ints,0,ints.length-1,0);
    }

    private static int rank(int key, int[] a, int lo, int hi,int deep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < deep; i++) {
            sb.append(" ");
        }
        if(lo >hi) return -1;
        int mid = lo + (hi -lo) /2;
        System.out.printf("%sdeep:%d\tlo:%d\tmid:%d\thi:%d%n",sb.toString(),deep,lo,mid,hi);
        if ( key < a[mid]) return rank(key, a, lo, mid - 1 , ++deep);
        else if(key > a[mid]) return rank(key, a, mid + 1, hi, ++deep);
        else return mid;

    }
}
