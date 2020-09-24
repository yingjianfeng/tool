package com.yjf.ela.singlemodel;

/**
 * Title: Single02
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 14:44
 */
public class Single02 {
    private static Single02 s = null;

    private Single02(){

    }

    public  static Single02 get(){
        if(s == null){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            s = new Single02();
        }
        return s;
    }

}
