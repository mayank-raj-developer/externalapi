package com.clientcall.demoforclientcall.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Slf4j
public class ExternalApiCallService {
    @Autowired
    private RestTemplate restTemplate;
    public void externalCall()
    {
        var temp=restTemplate.exchange("http://localhost:8500/mock/samplehttps://github.com/mayank-raj-developer/demo/pull/2", HttpMethod.GET, HttpEntity.EMPTY, String.class);
        //log.info("Value of external api : {}",(temp));
        System.out.println(temp.getBody());
    }
}
