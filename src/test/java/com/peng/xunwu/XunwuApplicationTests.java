package com.peng.xunwu;

import com.peng.xunwu.entity.User;
import com.peng.xunwu.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
@ActiveProfiles("test")
public class XunwuApplicationTests {

    @Autowired
    private UserRepository userRepository;

    //JPA + H2 集成测试
    @Test
    public void contextLoads() {
        List<User> all = userRepository.findAll();
        log.info("all" + all);

    }

    //JPA + MySQL集成测试
    @Test
    public void test2(){
        List<User> all = userRepository.findAll();
        log.info("all" + all);

    }


}

