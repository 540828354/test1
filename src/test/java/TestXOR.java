import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

/**
 * Created by Administrator on 2018/5/7.
 */
public class TestXOR{
    public static void main(String[] args) {
//        int[] array = {2,3,4,4,3,5,6,6,5};
//        int v = 0;
//        for (int i = 0;i < array.length;i++) {
//            v ^= array[i];
//            System.out.println(v);
//        }
//        System.out.println("只出现一次的数是:" + v);
//
        Date[] ds = {new Date(),new Date()};
        Long[] goodsids = {10831208L};
        String[] travellerIdNos = {"341003199801012222","341003190001012222"};
        checkSpecialBornYear(goodsids, travellerIdNos, ds);

    }

    //2018.05.18 此时游玩人信息和商品id无法做到一一对应，只能对订单只包含单商品10831208L的进行校验
    private static void checkSpecialBornYear(Long[] goodsIds, String[] travellerIdNos ,Date[] visitDates)  {
        if (goodsIds == null || goodsIds.length ==0 || !Arrays.asList(goodsIds).contains(10831208L)) {
            return;
        }
        if (travellerIdNos ==null || travellerIdNos.length == 0 || goodsIds.length >1) {
            System.out.println("1该商品仅限6-23周岁学生购买");
        }
        for (String travellerIdNo : travellerIdNos) {
            if (!checkAgeByIdYear(travellerIdNo, visitDates[0])) {
                System.out.println("2该商品仅限6-23周岁学生购买");
            }
        }
    }

    /**
     * 校验身份证出生日期 按年计算的周岁
     * @param idNo
     * @param visitDate
     * @return
     */
    private static boolean checkAgeByIdYear(String idNo ,Date visitDate) {
        boolean flag = false;
        if (idNo != null && idNo.length() == 18) {
            int bornYear = Integer.parseInt(idNo.substring(6, 10));
            SimpleDateFormat format = new SimpleDateFormat("yyyy");
            int visitYear = Integer.parseInt(format.format(visitDate));
            int age = visitYear - bornYear;
            if (age <= 23 && age >= 6) {
                flag = true;
            }
        }
        return flag;
    }

}
