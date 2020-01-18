package com.forewei.seckill.user.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.forewei.seckill.user.domain.UserDo;
import com.forewei.seckill.user.mapper.UserMapper;
import com.forewei.seckill.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Athor forewei
 * @Email forewei2015@gmail.com
 * @Date 2020/1/18
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public UserDo findByPhone(Long phone) {
        LambdaQueryWrapper<UserDo> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(UserDo::getId,phone);
        return userMapper.selectOne(queryWrapper);
    }
}
