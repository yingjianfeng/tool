package com.mq.consumer.service;

import org.apache.activemq.command.ActiveMQMessage;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.Session;
import javax.jms.TextMessage;

/**
 * Title: TopicService
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/4 15:38
 */
@Service
public class TopicService {
    @JmsListener(
            destination = "b"
    )
    public void receive1(TextMessage textMessage)throws Exception{
        System.out.println("******主题1收到消息："+textMessage.getText());
    }
    @JmsListener(
            destination = "b"
    )
    public void receive2(TextMessage textMessage)throws Exception{
        System.out.println("******主题2收到消息："+textMessage.getText());
    }


}
