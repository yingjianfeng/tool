package com.yjf.ela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Title: JpaMain
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/25 14:30
 */
@SpringBootApplication
@EnableTransactionManagement(proxyTargetClass = true)
public class JpaMain {
    public static void main(String[] args) {
        SpringApplication.run(JpaMain.class,args);
    }
}
