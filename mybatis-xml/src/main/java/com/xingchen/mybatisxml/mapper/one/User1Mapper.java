package com.xingchen.mybatisxml.mapper.one;

import com.xingchen.mybatisxml.model.User;
import com.xingchen.mybatisxml.param.UserParam;

import java.util.List;

public interface User1Mapper {
    List<User> getAll();

    List<User> getList(UserParam userParam);

    int getCount(UserParam userParam);

    User getOne(Long id);

    void insert(User user);

    int update(User user);

    int delete(Long id);
}
