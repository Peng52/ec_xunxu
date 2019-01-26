package com.peng.xunwu.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author : peng
 * @Description : 用户信息
 * @Date : 2019-01-16 16:23
 */
@Entity
@Table(name = "user")//因为数据库中的表名是user小写。？？
@Data
public class User {
    /**
     *主键ID
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    /**
     *用户名称
     */
    private String name;
    /**
     *用户密码
     */
    private String password;
    /**
     *用户邮箱
     */
    private String email;
    /**
     *手机号
     */
    //数据库中是有下划线，这里是驼峰，什么情况是默认直接可以映射到数据库的
     //哪些情况下需要使用@Column注解
    @Column(name="PHONE_NUMBER")
    private String phoneNumber;
    /**
     *状态
     */
    private Integer status;
    /**
     *创建时间
     */
    @Column(name = "CREATE_TIME")
    private Date createTime;
    /**
     *最后一次登录时间
     */
    @Column(name = "LAST_LOGIN_TIME")
    private Date lastLoginTime;
    /**
     *最后一次更新时间
     */
    @Column(name="LAST_UPDATE_TIME")
    private Date lastUpdateTime;
    /**
     *用户头像
     */
    private String avatar;

    

    
    
    
}
