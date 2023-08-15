package com.hong.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hong.pojo.Student;

@Mapper
public interface StudentMapper extends BaseMapper<Student>{
    // @Select("SELECT * FROM student")
    // public List<Student> list() ;
     
}
