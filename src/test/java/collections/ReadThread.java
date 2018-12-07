package collections;

import java.util.Map;

/**
 * Created by Administrator on 2018/12/7.
 */
public class ReadThread extends Thread{

    Map<Integer, Integer> hashMap;

    public ReadThread(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        System.out.println("value " + hashMap.get(0));
    }

}
