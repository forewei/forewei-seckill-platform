package com.forewei.seckill.user.service;

import com.forewei.seckill.user.domain.UserDo;

/**
 * @Athor forewei
 * @Email forewei2015@gmail.com
 * @Date 2020/1/18
 */
public interface UserService {
    UserDo findByPhone(Long phone);
}
