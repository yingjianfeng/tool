package com.yjf.ela.singlemodel;

import org.elasticsearch.common.inject.Singleton;
import org.junit.Test;
import sun.applet.Main;

/**
 * Title: test
 * Description:   junit不支持多线程测试
 *
 * @author yingjf
 * @date 2020/8/26 14:33
 */
public class test {
    @Test
    public void test() {
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable(){
                @Override
                public void run() {
                    Single01 single01 = Single01.get();
                    System.out.println("--->"+single01);
                }
            }).start();
        }
    }

    @Test
    public void test02() {
        Staticclass staticclass = new Staticclass();
        Staticclass.inner inner = new Staticclass.inner();
    }

    public static void main01(String[] args) {
        Runnable task = ()->{
            String threadName = Thread.currentThread().getName();
            Single02 s2 = Single02.get();
            System.out.println("线程 " + threadName + "\t => " + s2.hashCode());
        };
        for(int i=0;i<10;i++){
            new Thread(task,"" + i).start();
        }
    }

    public static void main(String[] args) {
        Runnable task = ()->{
            String threadName = Thread.currentThread().getName();
            Single03 s3 = Single03.get();
            System.out.println("线程 " + threadName + "\t => " + s3.hashCode());
        };
        for(int i=0;i<10;i++){
            new Thread(task,"" + i).start();
        }
    }

}
