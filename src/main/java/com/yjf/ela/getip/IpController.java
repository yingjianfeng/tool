package com.yjf.ela.getip;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Title: IpController
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/23 17:07
 */
@RestController
public class IpController {

    @GetMapping("getip")
    public String getip(HttpServletRequest request){
        return request.getRemoteAddr();
    }


}
