package pro.sky.calculator;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    public String Welcome() {
        return "<h1> Добро пожаловать </h1>";
    }

    public String CalculatorPlus() {
        return "<h1> Добро пожаловать в калькулятор</h1>";
    }

    @Override
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int sum = num1 + num2;
        return "<h1>" + Integer.toString(num1) + " + " + Integer.toString(num2) + " = " + sum + "</h1>";
    }

    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int minus = num1 - num2;
        return "<h1>" + Integer.toString(num1) + " - " + Integer.toString(num2) + " = " + minus + "</h1>";
    }

    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        int multiply = num1 * num2;
        return "<h1>" + Integer.toString(num1) + " * " + Integer.toString(num2) + " = " + multiply + "</h1>";
    }

    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        if (num2 == 0) {
            return "<h1>" + "На 0 делить нельзя !!! " + "</h1>";
        } else {
            int divide = num1 / num2;
            return "<h1>" + Integer.toString(num1) + " / " + Integer.toString(num2) + " = " + divide + "</h1>";
        }
    }
}
