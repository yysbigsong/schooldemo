package com.example.school.service.impl;

import com.example.school.dao.SchoolMapper;
import com.example.school.pojo.School;
import com.example.school.service.SchoolService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author:lenovo
 * @date: 2020/2/23
 */
@Service("SchoolService")
public class SchoolServiceImpl implements SchoolService {
    @Autowired
    public SchoolMapper schoolMapper;


    @Override
    public Page<School> searchSchool(Map map, Integer pageNum, Integer pageSize) {
        List list= (List) map.get("tabIds");
        if (list != null && !list.isEmpty()) {
            map.put("listSize",list.size());
        }
        PageHelper.startPage(pageNum, pageSize);
        return schoolMapper.searchSchool(map);
    }

    @Override
    public School getSchoolInfo(String  id) {
        return schoolMapper.selectByPrimaryKey(id);
    }
}
