package com.yjf.ela.annotation.controller;

import com.yjf.ela.annotation.config.ylog;
import com.yjf.ela.annotation.pojo.User;
import com.yjf.ela.annotation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: UserController
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 11:29
 */
@RestController
public class UserController {
    @Autowired
    IUserService iUserService;

    @ylog("ylog......")
    @GetMapping("/insert/{name}")
    public Object insert(@PathVariable String name){
        User user = new User();
        user.setName(name);
        iUserService.insert(user);
        return  user;
    }

    @ylog("ylog......")
    @GetMapping("/query/{id}")
    public Object query(@PathVariable int id){
        return  iUserService.queryById(id);
    }
}
