package com.ssq.quickspringboot.dao;

import com.ssq.quickspringboot.bean.Athelete;
import org.springframework.stereotype.Repository;

@Repository
public interface AthleteDAO {

    Athelete selectById(String id);



}
