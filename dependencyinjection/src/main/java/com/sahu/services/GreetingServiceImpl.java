package com.sahu.services;

import org.springframework.stereotype.Service;

/**
 * Created by vaibh on 7/19/2018.
 */
@Service
public class GreetingServiceImpl implements GreetingService {
    public static final String HELLO_GURUS = "Hello Gurus!!!!";

    @Override
    public String sayGreeting() {
        return HELLO_GURUS;
    }
}
