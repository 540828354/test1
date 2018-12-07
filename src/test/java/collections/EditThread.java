package collections;

import java.util.Map;

/**
 * Created by Administrator on 2018/12/7.
 */

class EditThread implements Runnable {

    Map<Integer, Integer> hashMap;

    public EditThread(Map<Integer, Integer> hashMap) {
        this.hashMap = hashMap;
    }

    @Override
    public void run() {
        hashMap.put(0, hashMap.get(0) + 1);
    }
}

