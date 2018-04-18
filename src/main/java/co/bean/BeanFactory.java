package co.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 通过Java配置的方式实现依赖注入
 */
@Configuration
public class BeanFactory {
    @Bean
    public MyRun2 myRun2()
    {
        return new MyRun2();
    }
}
