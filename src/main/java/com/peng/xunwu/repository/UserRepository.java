package com.peng.xunwu.repository;

import com.peng.xunwu.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @program: xunwu
 * @description: User - 用户相关
 * @author: peng
 * @create: 2019-01-16 22:18
 **/
public interface UserRepository extends JpaRepository<User,Long> {


}
