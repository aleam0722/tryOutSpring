package cn.chaopin.web;

import cn.chaopin.server.StudentService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OutTest {

    private StudentService studentService;

    @Test
    public void Test(){
//        在web层获取到studentService对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) applicationContext.getBean("studentService");
    }
}

