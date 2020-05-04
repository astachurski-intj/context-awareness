package com.example.contextawareness;

import org.springframework.stereotype.Component;

@Component
public class NumberAltConverter {
    public Integer convert(Integer x) {
        return x + 10;
    }
}
