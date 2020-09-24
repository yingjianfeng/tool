package com.yjf.ela.singlemodel;

/**
 * Title: Single03
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 15:19
 */
public class Single03 {

    //为什么instance 采用 volatile 关键字修饰？
    //
    //instance = new Singleton(); 这段代码其实是分为三步执行：
    //
    //为 uniqueInstance 分配内存空间
    //初始化 uniqueInstance
    //将 uniqueInstance 指向分配的内存地址
    volatile private static Single03 s = null;

    private Single03() {
    }

    public static Single03 get() {

        try {
            if (s != null) {

            } else {
                Thread.sleep(2000);
                synchronized (Single03.class) {
                    Thread.sleep(1000);
                    if (s == null) {
                        s = new Single03();
                    }
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return s;
    }
}
