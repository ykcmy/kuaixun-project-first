package com.kuaixun.mapper;

import com.kuaixun.model.User;

import java.util.List;

public interface UserMapper {

    int deleteByPrimaryKey(Integer userId);

    List<User> selectAllUser();

    int countUser();

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}