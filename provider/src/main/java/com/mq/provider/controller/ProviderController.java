package com.mq.provider.controller;

import com.mq.provider.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: ProviderController
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/4 14:15
 */
@RestController
public class ProviderController {
    @Autowired
    ProviderService providerService;

    @GetMapping("/addqueue/{queue}/{msg}")
    public String addqueue(@PathVariable String queue, @PathVariable String msg) {
        providerService.produceMsg(queue, msg);
        return " add msg success";
    }

    @GetMapping("/addtopic/{topic}/{msg}")
    public String addtopic(@PathVariable String topic, @PathVariable String msg) {
        providerService.topicMsg(topic, msg);
        return " add topic success";
    }

}
