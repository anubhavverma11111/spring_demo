package com.example.spring_demo.controllerDemo;

import com.example.spring_demo.serviceDemo.ServiceDemo1;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;


@RestController
@RequestMapping(value = "/demo")

public class ControllerDemo {
    @Autowired
    private ServiceDemo1 serviceDemo1;
    @RequestMapping("/index")

    public ArrayList Display(){
        //logger.info("- Downloader started");
        return serviceDemo1.getIndex();
    }
}
