package com.jpa.service;

import com.jpa.dao.TypeDao;
import com.jpa.pojo.TypePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Title: TypeSV2Impl
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/25 18:04
 */
@Service
public class TypeSV2Impl implements ITypeSV2 {
    @Autowired
    TypeDao typeDao;




    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void insert(TypePojo typePojo, boolean iserr) throws Exception {
        typeDao.save(typePojo);
        int i = 1/0;
    }
    @Transactional(propagation = Propagation.REQUIRED)
    public void tran(TypePojo typePojo) throws Exception {
        typeDao.save(typePojo);
        try {
            insert(typePojo,false);
        }catch (Exception e){
            System.out.println("err");
        }

    }

}
