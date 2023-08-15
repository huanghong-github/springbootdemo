package com.hong.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.hong.mapper.StudentMapper;
import com.hong.pojo.Student;
import com.hong.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    @Override
    public List<Student> list() {
        return studentMapper.selectList(null);
    }

    @Override
    public List<Student> listPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        return studentMapper.selectList(null);
    }

}
