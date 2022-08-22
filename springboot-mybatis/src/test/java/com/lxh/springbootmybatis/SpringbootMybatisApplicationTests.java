package com.lxh.springbootmybatis;

import com.lxh.springbootmybatis.domain.User;
import com.lxh.springbootmybatis.mapper.UserMapper;
import com.lxh.springbootmybatis.mapper.UserXmlMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootMybatisApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindAll() {
        List<User> list = userMapper.findAll();
        System.out.println(list);
    }

    @Autowired
    private UserXmlMapper userXmlMapper;

    @Test
    public void testFindAll2() {
        List<User> list = userXmlMapper.findAll2();
        System.out.println(list);
    }


}
