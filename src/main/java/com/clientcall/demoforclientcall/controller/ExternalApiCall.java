package com.clientcall.demoforclientcall.controller;

import com.clientcall.demoforclientcall.service.ExternalApiCallService;
import com.clientcall.demoforclientcall.service.FeignSampleService;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExternalApiCall {
@Autowired
    private ExternalApiCallService externalApiCallService;

@Autowired
    private FeignSampleService feignSampleService;
    @PostMapping("/test")
    public String externalApiCall()
    {
        externalApiCallService.externalCall();
        return "Called";
    }

    @GetMapping("/feign")
    public JsonNode feignCall()
    {
        return feignSampleService.sample();
    }
}
