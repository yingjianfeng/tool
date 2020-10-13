package com.yjf.ela;

import com.yjf.ela.jpa.dao.TypeDao;
import com.yjf.ela.jpa.pojo.TypePojo;
import com.yjf.ela.jpa.service.ITypeSV;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Title: JpaTest
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/25 16:12
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class JpaTest {
    @Autowired
    ITypeSV iTypeSV;

    @org.junit.Test
    public void test03() throws Exception{
        TypePojo pojo = new TypePojo();
        pojo.setName("小米"+new Date());
        iTypeSV.tran(pojo);
    }

}
