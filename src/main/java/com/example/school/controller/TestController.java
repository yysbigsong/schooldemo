package com.example.school.controller;

import com.alibaba.fastjson.JSONObject;
import com.example.school.dao.SchoolMapper;
import com.example.school.pojo.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author:lenovo
 * @date: 2020/2/23
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/getTest")
    public String getTest(){
        //School school= schoolMapper.selectByPrimaryKey  (1);
        return "test";
    }
}
