package com.example.contextawareness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    private CalculationEngine calculationEngine;

    @Autowired  //how we call this injection method?
    public void setCalculationEngine(CalculationEngine calculationEngine) {
        this.calculationEngine = calculationEngine;
    }

    public Integer calculate() {
        Integer res = calculationEngine.calculate(8, 2);
        return res;
    }
}
