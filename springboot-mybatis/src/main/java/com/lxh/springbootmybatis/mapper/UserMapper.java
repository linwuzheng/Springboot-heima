package com.lxh.springbootmybatis.mapper;

import com.lxh.springbootmybatis.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper

public interface UserMapper {
    @Select("select * from t_user")
    public List<User> findAll();

}
