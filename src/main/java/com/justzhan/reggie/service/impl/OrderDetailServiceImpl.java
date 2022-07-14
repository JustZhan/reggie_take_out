package com.justzhan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.justzhan.reggie.entity.OrderDetail;
import com.justzhan.reggie.mapper.OrderDetailMapper;
import com.justzhan.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}