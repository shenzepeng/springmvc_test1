package com.example.springmvc_test1.domain;

import java.io.Serializable;

public class User implements Serializable {

    private Long id;
    private String phoneNumber;
    private String password;
    private Integer age;
    private Double money;
    private Long iasd;
    private Long dasdasdasd;
    private Long asdasfasfasf;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", iasd=" + iasd +
                ", dasdasdasd=" + dasdasdasd +
                ", asdasfasfasf=" + asdasfasfasf +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Long getIasd() {
        return iasd;
    }

    public void setIasd(Long iasd) {
        this.iasd = iasd;
    }

    public Long getDasdasdasd() {
        return dasdasdasd;
    }

    public void setDasdasdasd(Long dasdasdasd) {
        this.dasdasdasd = dasdasdasd;
    }

    public Long getAsdasfasfasf() {
        return asdasfasfasf;
    }

    public void setAsdasfasfasf(Long asdasfasfasf) {
        this.asdasfasfasf = asdasfasfasf;
    }


}
