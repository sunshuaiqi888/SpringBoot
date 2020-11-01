package com.ssq.quickspringboot.service;

import com.ssq.quickspringboot.bean.Athelete;
import com.ssq.quickspringboot.dao.AthleteDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    AthleteDAO dao;
    //---------------------------------------- Mybatis ---------------------------------------------//
    public Athelete selectById(String id){
        return dao.selectById(id);
    }
}
