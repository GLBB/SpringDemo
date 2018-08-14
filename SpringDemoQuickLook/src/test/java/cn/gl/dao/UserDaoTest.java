package cn.gl.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class UserDaoTest {

    /**
     * quicklook
     */
    @Test
    public void test1(){
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao = applicationContext.getBean(UserDao.class);
        userDao.sayHello();
    }
}
