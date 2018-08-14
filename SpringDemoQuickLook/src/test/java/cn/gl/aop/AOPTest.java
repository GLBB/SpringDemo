package cn.gl.aop;

import cn.gl.aop.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AOPTest {
    @Autowired
    UserService userService;
    /**
     * quicklook
     * 结果：
     * around before
     * before
     * find
     * around after
     * after
     * AfterRunning
     */
    @Test
    public void test1(){
        userService.find();
    }
}
