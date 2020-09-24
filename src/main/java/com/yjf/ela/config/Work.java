package com.yjf.ela.config;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.jms.Topic;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;
import org.springframework.jms.config.SimpleJmsListenerContainerFactory;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Title: Work
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/17 16:36
 */
@Configuration
public class Work {
        @Scheduled(cron = "0/10 * * * * *")
        public void work() {
            System.out.println(new Date());
        }

    //定义存放消息的队列
    @Bean
    public Queue queue() {
        return new ActiveMQQueue("ActiveMQQueue");
    }
    @Bean
    public JmsMessagingTemplate jmsMessageTemplate(){
        return new JmsMessagingTemplate(new ActiveMQConnectionFactory("admin", "admin", "tcp://127.0.0.1:61616"));
    }




//    @Bean
//    public Topic topic() {
//        return new ActiveMQTopic("springboot.topic") ;
//    }

    //接收queue类型消息
    //destination对应配置类中ActiveMQQueue("springboot.queue")设置的名字
    @JmsListener(destination="ActiveMQQueue")
    public void ListenQueue1(String msg){
        System.out.println("Customer1接受到：" + msg);
    }
    @JmsListener(destination="ActiveMQQueue")
    public void ListenQueue2(String msg){
        System.out.println("Customer2接受到：" + msg);
    }

    //接收topic类型消息
    //destination对应配置类中ActiveMQTopic("springboot.topic")设置的名字
    //containerFactory对应配置类中注册JmsListenerContainerFactory的bean名称
//    @JmsListener(destination="springboot.topic", containerFactory = "jmsTopicListenerContainerFactory")
//    public void ListenTopic(String msg){
//        System.out.println("接收到topic消息：" + msg);
//    }
}
