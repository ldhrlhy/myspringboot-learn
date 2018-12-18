package com.xingchen.springbootredis.redis;

import com.xingchen.springbootredis.service.RedisService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestRedis {
    @Autowired
    private RedisService redisService;

    @Test
    public void testString() throws Exception {
        redisService.set("dong", "xingchen");
        Assert.assertEquals("xingchen", redisService.get("dong"));
    }

//    @Test
//    public void testObj() throws Exception {
//        User user=new User("ityouknow@126.com", "smile", "youknow", "know","2020");
//        redisService.set("user",user);
//        User userR=(User) redisService.get("user");
//        System.out.println("userR== "+userR.toString());
//    }
}
