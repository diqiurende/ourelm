package com.example.elm.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.elm.mapper.BusinessMapper;
import com.example.elm.mapper.UserMapper;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.elm.domain.*;

import java.util.List;

@RestController
@RequestMapping("/UserController")
@CrossOrigin(origins = "http://localhost:5173")
public class BusinessController {

    @Autowired
    BusinessMapper businessMapper;

    @GetMapping("/getAllBusinesses")
    public List<Business> getAllBusinesses() {
        List<Business> businessList=businessMapper.selectList(null);
        return businessList;
    }
}
