package com.yjf.ela.hutool.bloomfilter;

import cn.hutool.bloomfilter.BitMapBloomFilter;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Title: TestBloomFilter
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/24 14:05
 */
public class TestBloomFilter {
    public static void main(String[] args) {
        // 初始化
        BitMapBloomFilter filter = new BitMapBloomFilter(2000);
        Set set = new HashSet();

        for(int i=0; i<2000; i++){
            filter.add(i+"");
            set.add(i);
        }
        long t1 = System.currentTimeMillis();
        System.out.println(filter.contains(5 + ""));
        long t2 = System.currentTimeMillis();
        System.out.println(set.contains(5));
        long t3 = System.currentTimeMillis();
        System.out.println(t2-t1);
        System.out.println(t3-t2);
    }
}
