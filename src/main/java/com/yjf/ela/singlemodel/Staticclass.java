package com.yjf.ela.singlemodel;

/**
 * Title: Staticclass
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 15:13
 */
public class Staticclass {
    public Staticclass() {
        System.out.println("Staticclass...");
    }

    public static class inner{

        public inner() {
            System.out.println("inner...");
        }
    }

}
