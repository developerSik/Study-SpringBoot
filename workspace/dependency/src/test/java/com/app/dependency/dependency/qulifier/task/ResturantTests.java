package com.app.dependency.dependency.qulifier.task;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@Slf4j
public class ResturantTests {

    @Autowired
    private Resturant resturant;

    @Test
    public void ResturantTest(){
        log.info(resturant.toString());
    }

}
