package basic;

import java.util.function.IntConsumer;

public class PrintArray {



    //打印二维数组
    public static <T> void printTwoDimensionIntArray(int[][] barr, IntConsumer consumer) {
        for (int i = 0; i < barr.length; i++) {
            for (int j = 0; j < barr[i].length; j++) {
                consumer.accept(barr[i][j]);
            }
            System.out.println();
        }
    }
}
