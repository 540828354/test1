package java8;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/12/6.
 */
public class LearnMap {
    public static void main(String args[]) {
        Map<String, String> lm = new LinkedHashMap<>();
        lm.put("cdafdsf", "cdafdsf");
        lm.put("artt3423", "artt3423");
        lm.put("b6fgda", "bb6fgda");
        lm.put("e43dasfadsdf", "e43dasfadsdf");
        lm.put("54fgsdrs", "54fgsdrs");
        lm.put("asdfasfh", "asdfasfh");
        lm.put("43fr", "43fr");

        System.out.println("start");
        lm.forEach((s, s2) -> System.out.println(s2));
    }
}
