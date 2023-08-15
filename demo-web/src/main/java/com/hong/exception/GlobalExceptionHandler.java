package com.hong.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hong.api.CommonResult;

@RestControllerAdvice
public class GlobalExceptionHandler {
    // 全局异常处理器
    @ExceptionHandler(Exception.class)

    public CommonResult<String> ex(Exception e){
        e.printStackTrace();
        return CommonResult.failed("异常");
    }
    
}
