package com.hong.filter;

import java.io.IOException;

import org.springframework.core.annotation.Order;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter(urlPatterns="/*")
@Order(2)
public class Filtera implements Filter{
    // 过滤器，类名顺序

    @Override
    public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
            throws IOException, ServletException {
        // TODO Auto-generated method stub
        System.out.println("filter   a");
        arg2.doFilter(arg0, arg1);
    }
}
