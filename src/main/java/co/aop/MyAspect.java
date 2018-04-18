package co.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * 定义一个切面
 */
@Aspect
@Component
public class MyAspect {
    /**
     * 定义一个切点，关联到拦截规则
     */
    @Pointcut("@annotation(co.aop.MyFilter)")
    public void myPointCut()
    {}

    /**
     * 定义一个建言advice
     * @param point
     */
    @Before("myPointCut()")
    public void before(JoinPoint point)
    {
        //获取方法签名
        MethodSignature signature= (MethodSignature)point.getSignature();

        Method method= signature.getMethod();

        MyFilter filter= method.getAnnotation(MyFilter.class);

        System.out.println("before:"+filter.value());
    }
}
