package com.example.spring_demo.serviceDemo;

import com.example.spring_demo.com.example.spring_demo.dto.Customer;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
@Service
public class ServiceDemo1 {

    private ArrayList al;
    public ArrayList getIndex(){
        al=new ArrayList();
        al.add(new Customer("1","Anu","1222222"));
        return al;
    }


}
