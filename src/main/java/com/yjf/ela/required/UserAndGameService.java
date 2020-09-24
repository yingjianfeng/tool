package com.yjf.ela.required;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Title: UserAndGameService
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/25 16:43
 */
@Service
public class UserAndGameService {
    @Autowired
    UserDao userDao;
    @Autowired
    GameDao gameDao;
    @Transactional(propagation = Propagation.REQUIRED)
    public void methodB() {
        UserDo userDo = new UserDo();
        userDo.setId(2L);
        userDo.setName("user");
        userDao.insert(userDo);
        if (1 == 1) {
            throw new RuntimeException("异常");
        }
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void methodD() {
        try {
            UserDo userDo = new UserDo();
            userDo.setId(2L);
            userDo.setName("user");
            userDao.insert(userDo);
            if (1 == 1) {
                throw new RuntimeException("异常");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Autowired
    GameServide gameServide;

    @Transactional(propagation = Propagation.REQUIRED)
    public void methodE() {
        UserDo userDo = new UserDo();
        userDo.setName("user");
        userDao.insert(userDo);
        try {
            gameServide.meanB();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public void methodF() {
        UserDo userDo = new UserDo();
        userDo.setName("user");
        userDao.insert(userDo);
    }


}
