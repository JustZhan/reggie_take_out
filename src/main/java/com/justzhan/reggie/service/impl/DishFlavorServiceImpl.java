package com.justzhan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.justzhan.reggie.entity.DishFlavor;
import com.justzhan.reggie.mapper.DishFlavorMapper;
import com.justzhan.reggie.service.DishFlavorService;
import org.springframework.stereotype.Service;

@Service
public class DishFlavorServiceImpl extends ServiceImpl<DishFlavorMapper,DishFlavor> implements DishFlavorService {
}
