package com.yjf.ela.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.jms.Queue;
import javax.jms.Topic;

/**
 * Title: Mq
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/17 17:19
 */
@RestController
public class Mq {
    @Autowired
    private JmsMessagingTemplate jms;

    @Autowired
    private Queue queue;

//    @Autowired
//    private Topic topic;

    @RequestMapping("/queue")
    public String queue(){

        for (int i = 0; i < 10 ; i++){
            jms.convertAndSend(queue, "queue"+i);
        }

        return "queue 发送成功";
    }

}
