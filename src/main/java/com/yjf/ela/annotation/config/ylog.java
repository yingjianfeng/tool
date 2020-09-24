package com.yjf.ela.annotation.config;

import java.lang.annotation.*;

/**
 * Title: ylog
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 11:35
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ylog {
    String value() default "";
}
