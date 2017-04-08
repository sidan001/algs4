package basic;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * http://algs4.cs.princeton.edu/11model/largeW.txt
 * http://algs4.cs.princeton.edu/11model/largeT.txt
 *
 * java -cp .:/usr/local/algs4/algs4.jar BinarySearch largeW.txt < largeT.txt
 *
 */
public class BinarySearch {

    public static void main(String[] args) {
        int[] whitelist = new In(args[0]).readAllInts();
        Arrays.sort(whitelist);
        while (!StdIn.isEmpty()) {
            //读取key值，如果不存在于白名单中则将其打印
            int key = StdIn.readInt();
            if (rank(key, whitelist) < 0) {
                StdOut.println(key);
            }
        }
    }

    public static int rank(int key, int[] a) {
        //数组必须是有序的
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            //被查找的键要么存在，要么必然存在于a[lo..hi]之中
            int mid = lo + (hi -lo) / 2;
            if (key < a[mid]) hi = mid - 1 ;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return  -1;
    }
}
