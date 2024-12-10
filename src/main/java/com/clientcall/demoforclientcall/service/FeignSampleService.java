package com.clientcall.demoforclientcall.service;

import com.clientcall.demoforclientcall.configuration.configuration.FeignConfig;
import com.fasterxml.jackson.databind.JsonNode;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(url = "http://localhost:8500",name = "external-api",configuration = FeignConfig.class)
public interface FeignSampleService {
    @GetMapping(value = "/mock/sample")
     JsonNode sample();
}
