package com.example.springaopplaying.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class ServiceATest {

    @Autowired
    ServiceA serviceA;

    @Test
    void メソッドを実行すると開始ログが表示される() {
        serviceA.loop();
    }
}