package com.ls.a2service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/toPay")
    public String toPayMessage(){
        return restTemplate.getForObject("http://ls-a1service-ser/ls-a1service-pro/apiCheap/xiaoli",String.class);
    }

}
