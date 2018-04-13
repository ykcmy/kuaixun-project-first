package com.rokid.controller;

import com.rokid.model.User;
import com.rokid.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/user")
public class UserController {
    @Autowired
    private UserService userservice;
    @ResponseBody
    @RequestMapping(value="/add",produces={"application/json;charset=utf-8"})
    public int addUser(User user){
        return userservice.addUser(user);
    }
    @ResponseBody
    @RequestMapping(value="/all/{pageNum}/{pageSize}",produces = {"application/json;charset=utf-8"})
    public Object findAllUser(@PathVariable("pageNum") int pagenum,@PathVariable("pageSize") int pagesize){
        return userservice.findUserByPage(pagenum,pagesize);
    }
}