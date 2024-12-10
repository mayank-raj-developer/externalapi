package com.clientcall.demoforclientcall.controller;

import com.clientcall.demoforclientcall.service.ExternalApiCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalApiCall {

    @Autowired
    private ExternalApiCallService externalApiCallService;
    @PostMapping("/test")
    public String externalApiCall()
    {
        externalApiCallService.externalCall();
        return "Called";
    }
}
