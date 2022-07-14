package com.justzhan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.justzhan.reggie.entity.User;
import com.justzhan.reggie.mapper.UserMapper;
import com.justzhan.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper,User> implements UserService{
}
