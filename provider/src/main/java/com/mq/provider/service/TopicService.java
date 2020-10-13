package com.mq.provider.service;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;

import javax.jms.TextMessage;

/**
 * Title: TopicService
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/4 15:29
 */
//@Service
public class TopicService {
    @JmsListener(
            destination = "b"
    )
    public void receive(TextMessage textMessage)throws Exception{
        System.out.println("******队列收到消息："+textMessage.getText());
    }
}
