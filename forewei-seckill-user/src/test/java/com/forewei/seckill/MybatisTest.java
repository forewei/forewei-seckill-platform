package com.forewei.seckill;

/**
 * @Athor forewei
 * @Email forewei2015@gmail.com
 * @Date 2020/1/18
 */


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.forewei.seckill.user.ForeweiSeckillUserApplication;
import com.forewei.seckill.user.domain.UserDo;
import com.forewei.seckill.user.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ForeweiSeckillUserApplication.class)
public class MybatisTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void findUser() {
        List<UserDo> userDos = userMapper.selectList(new QueryWrapper<UserDo>());
        userDos.forEach(System.out::println);
    }
}
