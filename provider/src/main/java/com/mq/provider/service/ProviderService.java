package com.mq.provider.service;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.jms.Queue;
import java.util.UUID;

/**
 * Title: ProviderService
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/4 14:16
 */
@Component
public class ProviderService {
    @Autowired
    private JmsTemplate jmsTemplate;
//    private Queue queue = new ActiveMQQueue("queuetest");;


    public void produceMsg(String queuename,String msg){
//        jmsTemplate.setSessionTransacted(true);
        jmsTemplate.setSessionAcknowledgeMode(4);
        jmsTemplate.convertAndSend(new ActiveMQQueue(queuename),msg);
    }

    public void topicMsg(String topicname,String msg){
//        int AUTO_ACKNOWLEDGE = 1;自动确认
//        int CLIENT_ACKNOWLEDGE = 2;客户端手动确认
//        int DUPS_OK_ACKNOWLEDGE = 3;批量自动确认
//        int SESSION_TRANSACTED = 0;事物提交确认
        jmsTemplate.convertAndSend(new ActiveMQTopic(topicname),msg);
    }

//    @Scheduled(fixedDelay = 3000)
//    public void produceMsgScheduled(){
//        jmsTemplate.convertAndSend(queue,"****:"+ UUID.randomUUID().toString().substring(0,6));
//        System.out.println("*******ok");
//    }

}
