package com.example.jangwonseo.controller;

import java.time.LocalDateTime;
import java.util.List;

import com.example.jangwonseo.entity.Customer;
import com.example.jangwonseo.repository.CustomerRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    @Autowired CustomerRepository customerRepo;

    @RequestMapping("/")
    public String main() {
        return "main";
    }

    @RequestMapping("/getData")
    public List<Customer> getData() {
        System.out.println("Hello World!!!!!!!!!!!!!!!!!!!!!!!! come to getData");
        
        Customer customer = new Customer();
        customer.setPhone("010-2066-1503");
        customer.setGender(1);
        customer.setDeposit(0);
        customer.setCreateDatetime(LocalDateTime.now());
        customer.setCreateUser("jangwon.seo");
        List<Customer> customerList = customerRepo.findAll();
        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@length : "+customerList.size());
        for(Customer customerObj : customerList) {
            System.out.println(customerObj.getCustomerId());
        }
        // customerRepo.save(customer);
        return customerList;
        
        // return "welcome";
    }
}