package cn.chaofan.test;

import cn.chaofan.pojo.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
    @Test
    public void myTest(){
//        获取到上下文对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
//        通过ioc创建student对象
        Student student = (Student) applicationContext.getBean("student");

    }
}
