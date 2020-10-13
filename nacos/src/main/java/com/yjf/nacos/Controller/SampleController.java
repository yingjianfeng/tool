package com.yjf.nacos.Controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: SampleController
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/28 13:26
 */
@RestController
@RefreshScope
public class SampleController {
    @Value("${flag:123}")
    private String flag;


    @RequestMapping("/username")
    public String get() {

        return "msg:"+flag;
    }
}

@Data
@AllArgsConstructor
class people {
    String name;
    String age;
}
