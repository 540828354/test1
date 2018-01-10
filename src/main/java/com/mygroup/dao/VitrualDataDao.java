package main.java.com.mygroup.dao;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/10.
 */
public class VitrualDataDao {
    public Map<String,String> getVitrualData(){
        Map<String, String > map = new HashMap<>();
        map.put("a","1");
        map.put("b", "2");
        return map;
    }
}
