package com.example.redis.test;

import com.example.redis.model.Student;
import com.example.redis.utils.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * liang current user system login name
 * 2018/11/5 current system date
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {

    @Autowired
    private RedisUtil redisUtil;


    @Test
    public void  setAdd(){
        Student student=new Student();
        student.setAge(12);
        redisUtil.set("ll",student);
    }
}
