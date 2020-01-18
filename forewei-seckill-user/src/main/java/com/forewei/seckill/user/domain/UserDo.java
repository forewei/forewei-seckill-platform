package com.forewei.seckill.user.domain;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 用户实体类
 *
 * @Athor forewei
 * @Email forewei2015@gmail.com
 * @Date 2020/1/4
 */
@TableName(value = "sk_user")
@Data
public class UserDo {

    private Long id;

    /**
     * 用户昵称
     */

    private String nickname;

    /**
     * 用户密码 MD5(MD5(pass明文+固定salt)+salt
     */

    private String password;

    /**
     * 混淆值
     */

    private String salt;

    /**
     * 头像链接
     */

    private String headImgUrl;

    /**
     * 注册时间
     */

    private Date registerDate;

    /**
     * 最后登录时间
     */

    private Date lastLoginDate;

    /**
     * 登录次数
     */

    private Integer loginCount;

}

