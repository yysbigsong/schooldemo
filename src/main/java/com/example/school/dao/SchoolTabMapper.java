package com.example.school.dao;

import com.example.school.pojo.SchoolTab;

public interface SchoolTabMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(SchoolTab record);

    int insertSelective(SchoolTab record);

    SchoolTab selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(SchoolTab record);

    int updateByPrimaryKey(SchoolTab record);
}