package com.jpa.service;

import com.jpa.pojo.TypePojo;

/**
 * Title: ITypeSV2
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/25 18:04
 */
public interface ITypeSV2 {
    public void insert(TypePojo typePojo, boolean iserr) throws Exception;
    public void  tran(TypePojo typePojo)throws Exception;
}
