package com.d4rkr0n1n.application.controller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;

public class ApplicationControllerTest {

    @Value("${key.something}")
    private String something;

    @Test
    public void testEnv() {
        System.out.println(something);
        assert true;
    }
}
