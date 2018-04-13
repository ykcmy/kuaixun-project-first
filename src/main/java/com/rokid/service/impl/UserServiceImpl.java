package com.rokid.service.impl;

import com.github.pagehelper.PageHelper;
import com.rokid.mapper.UserMapper;
import com.rokid.model.PageBean;
import com.rokid.model.User;
import com.rokid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈用户操作类〉
 *
 * @author yangkai
 * @since 1.0.0
 */
@Service(value="userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserMapper usermapper;
    @Override
    public int addUser(User user) {
        return usermapper.insertSelective(user);
    }

    @Override
    public List<User> findUserByPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum,pageSize);

        List<User> alluser=usermapper.selectAllUser();
        int countNums=usermapper.countUser();
        PageBean<User> page=new PageBean(pageNum,pageSize,countNums);
        page.setList(alluser);

        return page.getList();
    }

    @Override
    public int Update(User user) {
        return 0;
    }
}