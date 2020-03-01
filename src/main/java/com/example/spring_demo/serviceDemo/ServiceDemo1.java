package com.example.spring_demo.serviceDemo;

import com.example.spring_demo.com.example.spring_demo.dto.Customer;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
@Slf4j
public class ServiceDemo1 {

    private ArrayList al;
    public ArrayList getIndex(){
        al=new ArrayList();
        log.info("Inside Service");
        log.info("Inside Service1");
        al.add(new Customer("1","Anu","1222222"));
        return al;
    }


}
