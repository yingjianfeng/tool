package com.yjf.ela.hutool.clone;

import cn.hutool.core.clone.CloneRuntimeException;

import java.util.Objects;

/**
 * Title: Cat
 * Description: 深拷贝和浅拷贝
 * 区别  浅拷贝的实例变量相同   浅拷贝则不相同
 *
 * 实现深拷贝    实现cloneable接口  重写clone方法
 *
 * @author yingjf
 * @date 2020/9/24 8:59
 */
public class Cat implements Cloneable{
    public String name = "miaomiao";
    public int age = 2;
    public Food food = new Food();


    @Override
    public Cat clone() {
        try {
            Cat cat = (Cat) super.clone();
            cat.food = (Food)this.food.clone();
            return cat;
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }

    public static void main(String[] args) throws Exception{
        Cat cat  = new Cat();
        System.out.println(cat+" "+cat.food+" "+cat.name.hashCode());
        Cat clone = (Cat)cat.clone();
        System.out.println(clone+" "+clone.food+" "+clone.name.hashCode());
    }
}

class Food implements Cloneable{
    String a = "food";
    @Override
    public Food clone() {
        try {
            return (Food) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new CloneRuntimeException(e);
        }
    }
}
