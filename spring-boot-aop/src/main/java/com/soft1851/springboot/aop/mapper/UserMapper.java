package com.soft1851.springboot.aop.mapper;

import com.soft1851.springboot.aop.entity.User;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @Description TODO
 * @Author 涛涛
 * @Date 2020/4/7 13:16
 * @Version 1.0
 **/
public interface UserMapper {
    /**
     * 查询所有用户
     * @return
     */
    @Select("SELECT * FROM db_spring.t_user order by ranking")
    List<User> selectAll();

}
