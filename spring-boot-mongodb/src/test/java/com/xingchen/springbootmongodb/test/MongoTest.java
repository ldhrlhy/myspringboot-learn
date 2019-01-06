package com.xingchen.springbootmongodb.test;

import com.xingchen.springbootmongodb.model.User;
import com.xingchen.springbootmongodb.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MongoTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    public void testSaveUser() throws Exception {
        User user=new User();
        user.setId(2l);
        user.setUserName("小明");
        user.setPassWord("fffooo123");
        userRepository.saveUser(user);
    }

    @Test
    public void findUserByUserName(){
        User user= userRepository.findUserByUserName("小明");
        System.out.println("user is "+user);
    }


}
