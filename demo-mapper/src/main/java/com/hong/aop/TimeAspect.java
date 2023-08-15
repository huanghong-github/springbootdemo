package com.hong.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
@Aspect
public class TimeAspect {
    // execution(访问修饰符? 返回值 包名.类名.?方法名(方法参数) throws 异常?) ?表示可以省略，*表示一个元素..表示多个元素，可以使用&& || ！
    // execution(public List<Student> com.hong.springbootdemo.mapper.StudentMapper.list())
    @Around("execution(* com.hong.mapper.*.*(..))")
    public Object recodeTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object object = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        log.info(proceedingJoinPoint.getSignature() + "  time ------>{}", end - start);
        return object;
    }
}
