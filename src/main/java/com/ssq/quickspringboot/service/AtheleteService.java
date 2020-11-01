package com.ssq.quickspringboot.service;

import com.ssq.quickspringboot.bean.Athelete;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.io.Serializable;
import java.util.List;

public interface AtheleteService extends JpaRepository<Athelete,String>,JpaSpecificationExecutor<Athelete>,Serializable {


    //---------------------------------------- JPA ---------------------------------------------//
    //1.JPA已经实现了基本的CRUD操作，因此不需要我们重新在此定义实现CRUD的方法
    //2.复杂的数据库操作就需要自己定义


    //3.JPA同时可以看到我们这⾥没有任何类SQL语句就完成了条件查询⽅法。
    // 这就是Spring-data-jpa的⼀⼤特性：通过解析⽅法名创建查询。
    // 注意：方法名不能随意命名，By后面的字段在Bean里面必须存在，否则映射不到会报错
    List<Athelete> findByName(String ath_name);


    //hibernate执行查询的语句hql是面向对象的查询，
    // 而不是面向数据库表的查询，因此在hql语句中的对象名必须与实体类的类名一致，严格区分大小写
    @Query(value = "select * from ad_athlete ath where ath.ath_id=:ath_id",nativeQuery = true)
    Athelete findAthelete(@Param("ath_id") String ath_id);



}
