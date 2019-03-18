package kr.hs.dgsw.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class GetController {

    @Autowired
    private CalculatorService cs;

    @GetMapping("/calculation")
    public BigDecimal cal(
            @RequestParam String num1,
            @RequestParam String num2,
            @RequestParam String operator
    ){
        return cs.calculation(num1, num2, operator);
    }

}
