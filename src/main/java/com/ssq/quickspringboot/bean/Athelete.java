package com.ssq.quickspringboot.bean;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ad_athlete")
public class Athelete{

    @Id
    @GeneratedValue(generator="system-uuid")
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @Column(name = "ath_id")
    private String ath_id             ; //  运动员编号
    @Column(name = "ath_name")
    private String name           ; //  姓名
    @Column(name = "ath_sex")
    private String ath_sex            ; //  性别
    @Column(name = "ath_birth")
    private String ath_birth          ; //  出生日期


    public String getAth_id() {
        return ath_id;
    }

    public void setAth_id(String ath_id) {
        this.ath_id = ath_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAth_sex() {
        return ath_sex;
    }

    public void setAth_sex(String ath_sex) {
        this.ath_sex = ath_sex;
    }

    public String getAth_birth() {
        return ath_birth;
    }

    public void setAth_birth(String ath_birth) {
        this.ath_birth = ath_birth;
    }
}
