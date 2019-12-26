package net.code;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @Before("execution(* showTopPage(..))")
    public void beforeShowTopPage() {

        System.out.println("トップページを表示します");
    }

    @AfterReturning("execution(* showTopPage(..))")
    public void afterShowTopPage() {

        System.out.println("トップページを表示しました");
    }
}
