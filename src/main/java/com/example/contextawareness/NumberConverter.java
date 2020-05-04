package com.example.contextawareness;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class NumberConverter {
    public Integer convert(Integer x) {
        return x * (-1);
    }
}
