package com.yjf.ela.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * Title: BloomFilterService
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/1 9:57
 */
@Service
@Slf4j
public class BloomFilterService {
    @Autowired
    RedisTemplate<String, String> redisTemplate;
    @Autowired
    BloomFilterDao bloomFilterDao;
    public static int i = 0;

    public void put(String h, String hk, String hv) {
        redisTemplate.opsForHash().put(h, hk, hv);
//        redisTemplate.expire(h, 100, TimeUnit.SECONDS);
    }

    @Transactional
    public String get(String h, String hk) {
        String res = (String) redisTemplate.opsForHash().get(h, hk);
        if (StringUtils.isEmpty(res)) {
            log.info("缓存中不存在");
            BloomFilter bloomFilter = bloomFilterDao.selectById(Integer.parseInt(hk));
            i++;
            // 为空的加一个缓存限制，防止缓存击穿，需要设置短一点的过期时间
            //不然会出现  这种无效数据增多  内存又不释放   增加redis内存压力
            if(StringUtils.isEmpty(bloomFilter)){
                redisTemplate.opsForHash().put(h,hk,"***");
                return "***";
            }
            log.info("i=  " + i);
            if (i > 2) {
                try {
                    Thread.sleep(50000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return bloomFilter.getName();
        }
        return res;
    }
}
