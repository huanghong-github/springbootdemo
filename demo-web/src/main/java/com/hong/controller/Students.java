package com.hong.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hong.api.CommonPage;
import com.hong.api.CommonResult;
import com.hong.pojo.Student;
import com.hong.service.StudentService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/hello")
public class Students {

    @Autowired
    private StudentService studentService;

    @GetMapping("/list")
    @ResponseBody
    public CommonResult<CommonPage<Student>> list(@RequestParam(name = "pageNum", defaultValue = "1") Integer pageNum,
            @RequestParam(name = "pageSize", defaultValue = "5") Integer pageSize) {
        log.info("get all students info");
        log.info("{} {}", pageNum, pageSize);
        List<Student> students = studentService.listPage(pageNum, pageSize);
        return CommonResult.success(CommonPage.restPage(students));
    }

    @GetMapping
    @ResponseBody
    public CommonResult<String> hello() {
        log.info("hello");

        return CommonResult.success("hello");
    }
}
