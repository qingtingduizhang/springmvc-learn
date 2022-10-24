package com.wuman.service.impl;

import com.wuman.entity.User;
import com.wuman.mapper.UserMapper;
import com.wuman.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author lmf
 * @version 1.0
 * @date 2022/10/21 14:28
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    public void register(User user) {
        userMapper.save(user);
    }
}
