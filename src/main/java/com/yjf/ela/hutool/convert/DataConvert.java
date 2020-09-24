package com.yjf.ela.hutool.convert;

import cn.hutool.core.convert.Convert;

/**
 * Title: DataConvert
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/24 10:03
 */
public class DataConvert {
    public static void main(String[] args) {
        int a = 1;
//aStr为"1"
        String aStr = Convert.toStr(a);
        System.out.println(aStr);
        long[] b = {1,2,3,4,5};
//bStr为："[1, 2, 3, 4, 5]"
        String bStr = Convert.toStr(b);
        System.out.println(bStr);
    }

}
