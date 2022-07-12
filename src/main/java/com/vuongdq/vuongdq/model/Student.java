/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.vuongdq.vuongdq.model;

import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class Student implements Serializable {
    private String id,fullname,email;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Student() {
    }

    public Student(String id, String fullname, String email, int age) {
        this.id = id;
        this.fullname = fullname;
        this.email = email;
        this.age = age;
    }
    

    
}
