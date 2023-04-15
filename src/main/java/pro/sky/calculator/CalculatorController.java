package pro.sky.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
    private final CalculatorServiceImpl calculatorServiceImpl;
    public CalculatorController(CalculatorServiceImpl calculatorServiceImpl){
        this.calculatorServiceImpl = calculatorServiceImpl;
    }
    @GetMapping
    public String Welcome() {
        return calculatorServiceImpl.Welcome();
    }
    @GetMapping(path = "/calculator")
    public String CalculatorPlus() {
        return calculatorServiceImpl.CalculatorPlus();
    }
    @GetMapping(path = "/calculator/plus")
    public String plus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.plus(num1, num2);
    }
    @GetMapping(path = "/calculator/minus")
    public String minus(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.minus(num1, num2);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiply(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.multiply(num1, num2);
    }
    @GetMapping(path = "/calculator/divide")
    public String divide(@RequestParam("num1") int num1, @RequestParam("num2") int num2) {
        return calculatorServiceImpl.divide(num1, num2);
    }
}
