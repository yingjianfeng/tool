package com.yjf.ela.singlemodel;

/**
 * Title: single01
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 14:31
 */
public class Single01 {
    private static Single01 s = new Single01();

    private Single01() {
    }

    public static Single01 get() {
        return s;
    }
}
