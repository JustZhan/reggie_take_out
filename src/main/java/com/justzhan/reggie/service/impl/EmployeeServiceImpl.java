package com.justzhan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.justzhan.reggie.entity.Employee;
import com.justzhan.reggie.mapper.EmployeeMapper;
import com.justzhan.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper,Employee> implements EmployeeService{
}
