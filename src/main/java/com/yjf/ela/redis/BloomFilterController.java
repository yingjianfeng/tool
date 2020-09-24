package com.yjf.ela.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: BloomFilterController
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/1 10:03
 */
@RestController
@Slf4j
public class BloomFilterController {
    @Autowired
    BloomFilterService bloomFilterService;

    @GetMapping("/put/{h}/{hk}/{hv}")
    public String put(@PathVariable String h, @PathVariable String hk, @PathVariable String hv) {
        log.info("success " + h + " " + hk + " " + hv);
        bloomFilterService.put(h, hk, hv);
        return "success";
    }

    @GetMapping("/get/{h}/{hk}")
    public String get(@PathVariable String h, @PathVariable String hk) {
        log.info("success " + h + " " + hk);
        return bloomFilterService.get(h, hk);
    }

}
