package com.yjf.ela.classForname;

/**
 * Title: Orgin
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/9/22 16:03
 */
public class Orgin {
    static {
        System.out.println("Orgin static执行。。。");
    }

    public Orgin() {
        System.out.println("Orgin  无参构造执行。。。");
    }
}

class Child extends Orgin{
    static {
        System.out.println("Child static执行。。。");
    }

    public Child() {
        System.out.println("Child  无参构造执行。。。");
    }

}
