package com.yjf.ela;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

////@EnableScheduling
//@SpringBootApplication
////@EnableJms //启动消息队列
//@EnableTransactionManagement(proxyTargetClass = true)
//@EnableConfigurationProperties
public class ElaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElaApplication.class, args);
    }

}
