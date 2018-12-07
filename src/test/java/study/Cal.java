package study;

/**
 * Created by Administrator on 2018/8/20.
 */
public class Cal {
    public static void main(String args[]) {
        //生日悖论
        int days = 365;
        double probability = 1.0;
        for (int i = 0; i < 30; i++) {
            probability = probability * (days - i) / days;
        }
        System.out.print(probability);
    }
}
