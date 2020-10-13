package com.jpa;

import com.jpa.pojo.TypePojo;
import com.jpa.service.ITypeSV;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
@SpringBootTest
class DemoApplicationTests {
    @Autowired
    ITypeSV iTypeSV;

    @Test
    void contextLoads() throws Exception{
        TypePojo pojo = new TypePojo();
        pojo.setName("小米" + new Date());
        iTypeSV.tran(pojo);

    }

}
