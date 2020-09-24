package com.yjf.ela.annotation.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Title: LogAspect
 * Description: TODO
 *
 * @author yingjf
 * @date 2020/8/26 11:37
 */
@Component
@Aspect
public class LogAspect {
    @Pointcut("@annotation(com.yjf.ela.annotation.config.ylog)")
    private void pointcut() {}

    @Before("pointcut() && @annotation(logger)")
    public void advice(JoinPoint joinPoint,ylog logger) {
        System.out.println("注解作用的方法名: " + joinPoint.getSignature().getName());

        System.out.println("所在类的简单类名: " + joinPoint.getSignature().getDeclaringType().getSimpleName());

        System.out.println("所在类的完整类名: " + joinPoint.getSignature().getDeclaringType());
        System.out.println("-------------------------------------------");
    }
}
