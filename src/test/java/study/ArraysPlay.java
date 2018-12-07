package study;

import java.util.Arrays;

/**
 * Created by Administrator on 2018/6/7.
 */
public class ArraysPlay {
    public static void main(String args[]) {
        int[] abc = {1,2,3,4};
        for (int i = 0; i < abc.length; i++) {
            int a[] = Arrays.copyOfRange(abc, i, i + 1);
            System.out.println(a);
        }
    }

}
