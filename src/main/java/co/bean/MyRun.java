package co.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 这里只是将类定义为一个Component，还没有通知IOC容器进行扫描管理，
 * 再通过单独定义BeanConfig告诉IOC容器对这个类进行扫描管理
 */
@Component
public class MyRun {
    @Autowired
    private MyRun1 run1;

    public void run()
    {
        System.out.println("MyRun:run");
        run1.run();
    }
}
