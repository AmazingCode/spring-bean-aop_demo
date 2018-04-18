package co.bean;

import co.aop.MyFilter;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * 通过以下两个注解告诉IOC容器对这个类进行bean管理
 */
@Component
@ComponentScan
public class MyRun1 {
    //测试aop，复用这个bean。。。
    @MyFilter("before lol")
    public void run()
    {
        System.out.println("MyRun1:run");
    }
}
