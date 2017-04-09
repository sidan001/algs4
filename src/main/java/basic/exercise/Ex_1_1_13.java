package basic.exercise;


import basic.PrintArray;

public class Ex_1_1_13 {

    public static void main(String[] args) {
        int[][] n_m_Array = {
                {1, 2, 3, 4,44},
                {5, 6, 7, 8,88},
                {9, 10, 11, 12,99}};

        arrayInterchange(n_m_Array);
    }



    //打印出一个N行M列数组的置换
    private static  void arrayInterchange(int[][] n_m_Array) {
        System.out.println("before:");
        PrintArray.printTwoDimensionIntArray(n_m_Array, t -> System.out.printf("%3d",t));

        int N = n_m_Array.length;
        int M = n_m_Array[0].length;

        int[][] result = new int[M][N];

        for (int i = 0; i < n_m_Array.length; i++) {
            for (int j = 0; j < n_m_Array[i].length; j++) {
                result[j][i] = n_m_Array[i][j];
            }
        }
        System.out.println("after:");
        PrintArray.printTwoDimensionIntArray(result, t -> System.out.printf("%3d",t));
    }


}
