package com.yjf.ela.annotation.service;

import com.yjf.ela.annotation.pojo.User;

/**
 * Title: IUserService
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 11:22
 */
public interface IUserService {
    void insert(User user);

    User queryById(int id);
}
