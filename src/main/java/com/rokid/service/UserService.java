package com.rokid.service;

import com.rokid.model.User;

import java.util.List;

/**
 * 〈用户操作接口〉
 *
 * @author yangkai
 * @since 1.0.0
 */
public interface UserService {
    int addUser(User user);
    List<User> findUserByPage(int pageNum, int pageSize);
    int Update(User user);
}