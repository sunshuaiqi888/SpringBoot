package com.ssq.quickspringboot.bean;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Dog {

    /**
     * @Value 是spring 的底层注解，
     * 1.字面量
     * 2.${} （从配置文件中获取的值）
     * 3.#{SpEL} （spring表达式）
     */

    @Value("${person.dog.name}")
    private String name;
    @Value("#{11*2}")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
