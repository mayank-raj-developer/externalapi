package com.clientcall.demoforclientcall.configuration.configuration;

import feign.Request;

import org.springframework.context.annotation.Bean;


public class FeignConfig {
    @Bean
    public Request.Options options()
    {
        return new Request.Options(120000,30000);
    }
}
