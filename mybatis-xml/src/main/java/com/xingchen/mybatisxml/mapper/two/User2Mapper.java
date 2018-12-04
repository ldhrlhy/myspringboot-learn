package com.xingchen.mybatisxml.mapper.two;

import com.xingchen.mybatisxml.model.User;
import com.xingchen.mybatisxml.param.UserParam;

import java.util.List;

public interface User2Mapper {
    List<User> getAll();

    List<User> getList(UserParam userParam);

    int getCount(UserParam userParam);

    User getOne(Long id);

    void insert(User user);

    int update(User user);

    int delete(Long id);
}
