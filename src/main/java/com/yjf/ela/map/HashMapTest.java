package com.yjf.ela.map;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Title: HashMapTest
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/11 14:23
 */
public class HashMapTest implements Runnable{
//    static Map map = new HashMap<>(8);
//    static Map map = Collections.synchronizedMap(new HashMap<>(8));
    static Map map = new ConcurrentHashMap();

    @Override
    public void run() {
        for(int i = 0; i<40; i++){

            System.out.println(i);
            map.put(i,i);
            System.out.println(map);
        }
    }

    public static void main(String[] args) {
        ThreadLocal<String> local = new ThreadLocal<>();
        local.set("xxx");
        String s = local.get();
        System.out.println(s);
        String ss = local.get();
        System.out.println(ss);

    }
}
