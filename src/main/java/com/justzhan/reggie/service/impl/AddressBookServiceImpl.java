package com.justzhan.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.justzhan.reggie.entity.AddressBook;
import com.justzhan.reggie.mapper.AddressBookMapper;
import com.justzhan.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {

}
