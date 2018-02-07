package com.mygroup.dao;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * @author  wx
 * Created by Administrator on 2018/1/10.
 */
@Service
public class VirtualDataDao {
    public Map<String,String> getVirtualData(){
        Map<String, String > map = new HashMap<>();
        map.put("a","1");
        map.put("b", "2");
        return map;
    }
}
