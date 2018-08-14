package cn.gl.aop.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect
@Component
@EnableAspectJAutoProxy
public class MyAdvice {
    @Pointcut("execution(* cn.gl.aop.service.*ServiceImpl.*(..))")
    public void pointCut(){}

    @Before("MyAdvice.pointCut()")
    public void before(){
        System.out.println("before");
    }

    @AfterReturning("execution(* cn.gl.aop.service.*ServiceImpl.*(..))")
    public void afterReturn(){
        System.out.println("AfterRunning");
    }

    @Around("MyAdvice.pointCut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("around before");
        Object proceed = joinPoint.proceed();
        System.out.println("around after");
        return proceed;
    }

    @AfterThrowing("MyAdvice.pointCut()")
    public void afterException(){
        System.out.println("afterException");
    }

    @After("MyAdvice.pointCut()")
    public void after(){
        System.out.println("after");
    }

}
