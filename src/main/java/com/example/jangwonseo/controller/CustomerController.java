package com.example.jangwonseo.controller;

import java.time.LocalDateTime;

import com.example.jangwonseo.entity.Customer;
import com.example.jangwonseo.repository.CustomerRepository;

import org.hibernate.validator.internal.metadata.aggregated.rule.VoidMethodsMustNotBeReturnValueConstrained;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/")
public class CustomerController {

    @Autowired CustomerRepository customerRepo;

    @RequestMapping(value="/hello", method=RequestMethod.GET)
    public void MethodsMustNotBeReturnValueConstrainedllo(ModelMap model) {
        System.out.println("Hello World!");
        model.addAttribute("message", "this is a message");
        Customer customer = new Customer();
        customer.setPhone("010-2066-1503");
        customer.setGender(1);
        customer.setDeposit(0);
        customer.setCreateDatetime(LocalDateTime.now());
        customer.setCreateUser("jangwon.seo");

        // customerRepo.save(customer);
        
        model.addAttribute("customerList", customerRepo.findAll());
        // return "welcome";
    }
}