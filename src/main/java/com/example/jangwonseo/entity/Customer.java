package com.example.jangwonseo.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="CUSTOMER_ID")
    private Long customerId;
 
    @Column(name="NAME")
    private String name;

    @Column(name="PHONE")
    private String phone;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="GENDER")
    private Integer gender;

    @Column(name="AGE")
    private Integer age;

    @Column(name="EMAIL")
    private String email;

    @Column(name="DEPOSIT")
    private Integer deposit;

    @Column(name="FEATURE")
    private String feature;

    @Column(name="REMARK")
    private String remark;

    @Column(name="CREATE_USER")
    private String createUser;

    @Column(name="CREATE_DATETIME")
    private LocalDateTime createDatetime;

    @Column(name="UPDATE_USER")
    private String updateUser;

    @Column(name="UPDATE_DATETIME")
    private LocalDateTime updateDatetime;
}