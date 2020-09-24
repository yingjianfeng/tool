package com.yjf.ela;

import com.yjf.ela.index.pojo;
import com.yjf.ela.index.pojodao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Title: IndexTest
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/28 15:16
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@EnableAutoConfiguration
public class IndexTest {
    @Autowired
    pojodao dao;

    @Test
    public void add(){
        long time = new Date().getTime();
        System.out.println();
        for(int i=0;i<10000; i++){
            pojo pojo = new pojo();
            pojo.setAge(ThreadLocalRandom.current().nextLong(20,100));
            pojo.setName(UUID.randomUUID().toString().replace("-",""));
            pojo.setQq(ThreadLocalRandom.current().nextLong(100000,1000000));
            dao.insert(pojo);
        }
    }
}
