package com.yjf.ela;

import org.apache.http.client.HttpClient;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * Title: TransTest
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/1 16:18
 */
@SpringBootTest
public class TransTest {
    @Autowired
    HttpClient httpClient;
    @Test
    public void to(){
        System.out.println(httpClient);
    }
}
