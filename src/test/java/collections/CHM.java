package collections;

import java.util.concurrent.ConcurrentHashMap;

/**
 * Created by Administrator on 2018/12/7.
 */
public class CHM {
    public static void main(String[] args) {
        /** 全局ConcurrentHashMap*/
        ConcurrentHashMap<Integer, Integer> hashMap = new ConcurrentHashMap();
        hashMap.put(0, 0);

        /** 多线程编辑100次*/
        for (int i = 0; i < 100; i++) {
            if (i == 99) {
                System.out.println("======="+i);
            }
            new Thread(new EditThread(hashMap)).start();
        }

        /** 读取线程*/
        System.out.println("%%%%%%%%%%%%");
        new Thread(new ReadThread(hashMap)).start();
        /** 输出最终结果*/
        System.out.println("Demo2 main value " + hashMap.get(0));
    }

}
