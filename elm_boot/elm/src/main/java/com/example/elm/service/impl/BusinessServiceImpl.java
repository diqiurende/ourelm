package com.example.elm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.elm.domain.Business;
import com.example.elm.service.BusinessService;
import com.example.elm.mapper.BusinessMapper;
import org.springframework.stereotype.Service;

/**
* @author faiz
* @description 针对表【business】的数据库操作Service实现
* @createDate 2024-01-08 22:04:01
*/
@Service
public class BusinessServiceImpl extends ServiceImpl<BusinessMapper, Business>
    implements BusinessService{

}




