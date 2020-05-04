package com.example.contextawareness;

import org.omg.CORBA.INTERNAL;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

@Service
public class CalculationEngine implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public Integer calculate(Integer x, Integer y) {
        if (x % 2 == 0) {
            x = applicationContext.getBean(NumberConverter.class).convert(x);
        } else {
            x = applicationContext.getBean(NumberAltConverter.class).convert(x);
        }
        return x + y;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
