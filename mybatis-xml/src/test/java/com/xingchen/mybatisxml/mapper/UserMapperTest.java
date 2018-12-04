package com.xingchen.mybatisxml.mapper;

import com.xingchen.mybatisxml.enums.UserSexEnum;
import com.xingchen.mybatisxml.mapper.one.User1Mapper;
import com.xingchen.mybatisxml.mapper.two.User2Mapper;
import com.xingchen.mybatisxml.model.User;
import com.xingchen.mybatisxml.param.UserParam;
import com.xingchen.mybatisxml.result.Page;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Autowired
    private User1Mapper user1Mapper;
    @Autowired
    private User2Mapper user2Mapper;


//    @Test
//    public void testUser()  {
//        //增加
//        userMapper.insert(new User("aa", "a123456", UserSexEnum.MAN));
//        //删除
//        int count=userMapper.delete(2l);
//        User user = userMapper.getOne(1l);
//        user.setNickName("smile");
//        //修改
//        userMapper.update(user);
//        //查询
//        List<User> users = userMapper.getAll();
    //}

    @Test
    public void testInsert()  {
        user1Mapper.insert(new User("aa", "a123456", UserSexEnum.MAN));
        user2Mapper.insert(new User("bb", "b123456", UserSexEnum.WOMAN));
        user2Mapper.insert(new User("cc", "b123456", UserSexEnum.WOMAN));

        //Assert.assertEquals(3, userMapper.getAll().size());
    }

//    @Test
//    public void testQuery() {
//        List<User> users = userMapper.getAll();
//        if(users==null || users.size()==0){
//            System.out.println("is null");
//        }else{
//            System.out.println("users list is :"+users.toString());
//        }
//    }
//

//    @Test
//    public void testUpdate() {
//        long id=1l;
//        User user = userMapper.getOne(id);
//        if(user!=null){
//            System.out.println(user.toString());
//            user.setNickName("neo");
//            userMapper.update(user);
//            Assert.assertTrue(("neo".equals(userMapper.getOne(id).getNickName())));
//        }else {
//            System.out.println("not find user id="+id);
//        }
//    }
//
//
//    @Test
//    public void testDelete() {
//        int count=userMapper.delete(29l);
//        if(count>0){
//            System.out.println("delete is sucess");
//        }else {
//            System.out.println("delete if failed");
//        }
//    }
//
//
//    @Test
//    public void testPage() {
//        UserParam userParam=new UserParam();
////		userParam.setUserSex("WOMAN");
//        userParam.setCurrentPage(0);//0 是第一页，1 是第二页 依次类推
//        List<User> users=userMapper.getList(userParam);
//        long count=userMapper.getCount(userParam);
//        Page page = new Page(userParam,count,users);
//        System.out.println("page == " +page);
    //}
}
