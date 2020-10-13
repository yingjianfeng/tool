package com.mq.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Message;
import javax.jms.TextMessage;

/**
 * Title: ConsumerController
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/4 17:56
 */
@RestController
public class ConsumerController {
    @GetMapping("get")
    public String get() throws Exception {
        JmsTemplate jmsTemplate = new JmsTemplate();
        //关闭事物
        jmsTemplate.setSessionTransacted(false);
        //设置为单条消息确认
        jmsTemplate.setSessionAcknowledgeMode(4);
        TextMessage message = (TextMessage) jmsTemplate.receive();
        return message.getText();
    }
}
