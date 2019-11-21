package com.example.springaopplaying.service;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {

    public void loop() {
        int sum = 0;
        for (int i = 0; i < 100000; i++) {
            sum += i;
        }
    }
}
