package com.yjf.ela;

import com.yjf.ela.required.GameServide;
import com.yjf.ela.required.UserAndGameService;
import com.yjf.ela.required.UserDao;
import com.yjf.ela.required.UserDo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Title: RequiredTest
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/25 16:40
 */
@SpringBootTest
public class RequiredTest {

    @Autowired
    UserAndGameService userAndGameService;
    @Autowired
    GameServide gameServide;
    @Test
    public void test01(){
        userAndGameService.methodB();
        System.out.println("over");
    }

    @Test
    public void test02(){
        userAndGameService.methodD();
        System.out.println("over");
    }
    @Test
    public void test03(){
        userAndGameService.methodE();
        System.out.println("over");
    }

    // 单独开事务
    @Test
    public void test04(){
        userAndGameService.methodF();
        int i = 1/0;
        gameServide.meanC();
        System.out.println("over");
    }
}
