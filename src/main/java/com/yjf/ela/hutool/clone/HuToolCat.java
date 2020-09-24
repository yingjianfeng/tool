package com.yjf.ela.hutool.clone;

import cn.hutool.core.clone.CloneSupport;
import cn.hutool.core.util.ObjectUtil;

import java.io.Serializable;

/**
 * Title: HuToolCat
 * Description:    hutool 工具 进行深拷贝   只需实现序列化接口   对象传入 ObjectUtil.cloneByStream即可
 *
 * @author yingjf
 * @date 2020/9/24 9:22
 */
public class HuToolCat implements Serializable {
    private String name = "wangwang";
    private int age = 3;
    public Foods foods = new Foods();


    public static void main(String[] args) {
        HuToolCat cat = new HuToolCat();
        cat.name = "cat";
        System.out.println(cat+" "+cat.foods+" "+cat.name);
        HuToolCat clone = ObjectUtil.cloneByStream(cat);
        System.out.println(clone+" "+clone.foods+" "+clone.name);
        String str1 = "123";
        String str2 = str1;
        str2 = "234";
        System.out.println(str1+" "+str2);
    }

}

class Foods implements Serializable {
    String s = "12";
}