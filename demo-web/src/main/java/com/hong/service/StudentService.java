package com.hong.service;

import java.util.List;

import com.hong.pojo.Student;

public interface StudentService {
    public List<Student> list();

    public List<Student> listPage(Integer pageNum,Integer pageSize);
}
