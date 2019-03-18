package kr.hs.dgsw.demo;

import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class CalculatorServiceImp implements CalculatorService{

    @Override
    public BigDecimal calculation(String num1, String num2, String operator) {

        // 부동 소수점 오차를 해결하기 위한 BigDecimal 클래스
        BigDecimal number1 = new BigDecimal(num1);
        BigDecimal number2 = new BigDecimal(num2);

        switch (operator){
            case "+" : return number1.add(number2);
            case "-" : return number1.subtract(number2);
            case "*" : return number1.multiply(number2);
            case "/" : return number1.divide(number2, BigDecimal.ROUND_HALF_UP); // 소수점 4번째 자리에서 반올림
            default: break;
        }
        return null;
    }
}
