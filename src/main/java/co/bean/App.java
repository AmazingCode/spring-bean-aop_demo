package co.bean;

import co.aop.AspectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.servlet.FilterConfig;
import java.util.HashMap;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //bean 测试
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(BeanConfig.class);
        MyRun run= context.getBean(MyRun.class);
        run.run();

        context.getBean(MyRun2.class).run();

        //filter 测试
        AnnotationConfigApplicationContext contextFilter=new AnnotationConfigApplicationContext(AspectConfig.class);


        contextFilter.getBean(MyRun1.class).run();


        //HashMap 测试
        HashMap<String,String> maps=new HashMap<>();
        maps.put("key","value1");
        maps.put("key","value2");

        System.out.println("count:"+maps.size()+"||key:"+maps.get("key"));
    }
}
