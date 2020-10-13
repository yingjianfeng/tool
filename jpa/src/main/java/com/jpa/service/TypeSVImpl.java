package com.jpa.service;

import com.jpa.dao.TypeDao;
import com.jpa.pojo.TypePojo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


/**
 * Title: TypeSVImpl
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/25 17:12
 */
@Service
public class TypeSVImpl implements ITypeSV {
    @Autowired
    TypeDao typeDao;
    @Autowired
    ITypeSV2 iTypeSV2;


    @Override
    public TypePojo qryById(long id) throws Exception {
        TypePojo pojo = typeDao.findById(id).get();
        return pojo;
    }

    @Transactional(propagation = Propagation.NESTED)
    public void insert(TypePojo typePojo,boolean iserr) throws Exception {
        typeDao.save(typePojo);
        int i = 1/0;
    }
    @Transactional
//    @Transactional(propagation = Propagation.REQUIRED)
    public void tran(TypePojo typePojo) throws Exception {
        typePojo.setName("t1");
        typeDao.save(typePojo);

        try {
            typePojo.setName("t2");
            iTypeSV2.insert(typePojo,false);
//            int i = 1/0;
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
