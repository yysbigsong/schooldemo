package com.example.school.service;

import com.example.school.pojo.School;
import com.github.pagehelper.Page;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:lenovo
 * @date: 2020/2/23
 */
public interface SchoolService {

    /**
     * 分页查询高校信息
     * @param map
     * @param pageNum
     * @param pageSize
     * @return
     */
    public Page<School> searchSchool(Map map , Integer pageNum, Integer pageSize);

    /**
     * 根据id获取高校详细信息
     * @param id
     * @return
     */
    public School getSchoolInfo(String id);
}
