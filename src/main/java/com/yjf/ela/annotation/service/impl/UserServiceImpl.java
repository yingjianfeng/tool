package com.yjf.ela.annotation.service.impl;

import com.yjf.ela.annotation.dao.UserMapper;
import com.yjf.ela.annotation.pojo.User;
import com.yjf.ela.annotation.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Title: UserServiceImpl
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 11:22
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void insert(User user) {
        userMapper.insert(user);
    }

    @Override
    public User queryById(int id) {
        return userMapper.selectById(id);
    }
}
