package com.example.jangwonseo.controller;

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
    public String getData() {
        System.out.println("Hello World!!!!!!!!!!!!!!!!!!!!!!!! come to getData");
        // model.addAttribute("message", "this is a message");
        // Customer customer = new Customer();
        // customer.setPhone("010-2066-1503");
        // customer.setGender(1);
        // customer.setDeposit(0);
        // customer.setCreateDatetime(LocalDateTime.now());
        // customer.setCreateUser("jangwon.seo");

        // customerRepo.save(customer);
        return "this is message";
        // model.addAttribute("customerList", customerRepo.findAll());
        // return "welcome";
    }
}