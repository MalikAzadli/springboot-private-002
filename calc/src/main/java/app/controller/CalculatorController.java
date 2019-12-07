package app.controller;

import app.entity.Calculator;
import app.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CalculatorController {

    private final Calculator calculator;

    public CalculatorController(@Autowired Calculator calculator) {
        this.calculator = calculator;
    }

    @GetMapping("/calc")
    public String operate(@RequestParam("op1") String op1, @RequestParam("op2") String op2, @RequestParam("op") String op) {
        return calculator.operate(op1, op2, op);
    }

    @GetMapping("/calcs")
    public User calcs() {
        return new User("James");
    }
}
