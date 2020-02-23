package com.example.school.controller;

import com.example.school.pojo.School;
import com.example.school.service.SchoolService;
import com.example.school.utils.PageInfo;
import com.github.pagehelper.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @author:lenovo
 * @date: 2020/2/23
 */
@RestController
@RequestMapping("/school")
public class SchoolController {
    @Autowired
    public SchoolService schoolService;

    @RequestMapping("/searchSchool")
    public Object searchSchool(@RequestBody(required = false) Map params,
                               @RequestParam(defaultValue = "1") Integer pageNum,
                               @RequestParam(defaultValue = "10") Integer pageSize){
        Page<School> schools =schoolService.searchSchool(params,pageNum,pageSize);
        // 需要把Page包装成PageInfo对象才能序列化。该插件也默认实现了一个PageInfo
        PageInfo<School> pageInfo = new PageInfo<>(schools);
        return pageInfo;
    }

    @RequestMapping("/getSchoolInfo")
    public Object getSchoolInfo(@RequestParam String id){
        return schoolService.getSchoolInfo(id);
    }
}
