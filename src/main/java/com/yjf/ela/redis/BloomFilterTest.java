package com.yjf.ela.redis;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

/**
 * Title: BloomFilter
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/1 9:21
 */
public class BloomFilterTest {
    public static void main(String[] args) {
        int total  = 10000;//总数量
        BloomFilter<CharSequence> bf =
                BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_8),total,0.0002);
        for (int i=0; i<total; i++){
            bf.put(""+i);
        }
        int count = 0;
        for (int i = 0; i < total+10000; i++) {
            if (bf.mightContain(""+i)){
                count++;
            }
        }
        System.out.println("已匹配数量 "+count);
    }
}
