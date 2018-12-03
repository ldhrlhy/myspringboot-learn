package com.xingchen.springbootjpa.service;

import com.xingchen.springbootjpa.model.UserDetail;
import com.xingchen.springbootjpa.param.UserDetailParam;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserDetailService {
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable);
}
