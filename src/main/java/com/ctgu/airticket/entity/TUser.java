package com.ctgu.airticket.entity;

import java.io.Serializable;

/**
 * (TUser)实体类
 *
 * @author makejava
 * @since 2020-12-18 15:33:08
 */
public class TUser implements Serializable {
    private static final long serialVersionUID = 194488516162531170L;
    
    private Integer id;
    
    private String email;
    
    private String password;
    
    private String phone;
    
    private String sex;
    
    private String idcard;
    
    private String truename;
    
    private String username;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

}