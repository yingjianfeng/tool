package com.mq.consumer.service;

import org.apache.activemq.command.ActiveMQMessage;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Title: ConsumerService
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/4 15:01
 */
//@Service
public class ConsumerService {

//    @JmsListener(
//            destination = "a"
//    )
//    public void receive(TextMessage textMessage)throws Exception{
//        System.out.println("******消费者收到消息："+textMessage.getText());
//    }
    @JmsListener(destination = "a" )
    public void consumer(TextMessage  message, Session session) throws Exception {
        System.out.println(session.getAcknowledgeMode());
        System.out.println(session.getTransacted());
        System.out.println("******队列3收到消息："+message.getText());
//        message.acknowledge();
    }
}
