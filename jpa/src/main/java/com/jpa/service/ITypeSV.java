package com.jpa.service;

import com.jpa.pojo.TypePojo;

/**
 * Title: ITypeSV
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/25 17:12
 */
public interface ITypeSV {
    TypePojo qryById(long id) throws Exception;

    public void insert(TypePojo typePojo,boolean iserr) throws Exception;
    public void  tran(TypePojo typePojo)throws Exception ;
}
