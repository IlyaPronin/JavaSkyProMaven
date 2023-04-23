package pro.sky.JavaSkyPro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class CalculatorController {
//    private final CalculatorService calculatorService;
//    public CalculatorController(CalculatorService calculatorService){
//        this.calculatorService = calculatorService;

    @GetMapping
    public String welcome(){
    return "Welcome";
}
    @GetMapping(path = "/calculator")
    public String greeting(){
        return "Добро пожаловать в калькулятор";
    }
    @GetMapping(path = "/calculator/plus")
    public String sumNumber(@RequestParam("num1") Double a,@RequestParam("num2") Double b){
        if(a == null||b == null){
            return "Не передан один из параметров";
        }
        return a+"+"+b+"="+(a+b);
    }
    @GetMapping(path = "/calculator/minus")
    public String minusNumber(@RequestParam("num1") Double a,@RequestParam("num2") Double b){
        if(a == null||b == null){
            return "Не передан один из параметров";
        }
        return a+"-"+b+"="+(a-b);
    }
    @GetMapping(path = "/calculator/multiply")
    public String multiplyNumber(@RequestParam("num1") Double a,@RequestParam("num2") Double b){
        if(a == null||b == null){
            return "Не передан один из параметров";
        }
        return a+"*"+b+"="+(a*b);
    }
    @GetMapping(path = "/calculator/divide")
    public String divideNumber(@RequestParam("num1") Double a,@RequestParam("num2") Double b){
        if(a == null||b == null){
            return "Не передан один из параметров";
        }
        else if(a==0||b==0){
            return "На ноль делить нельзя";
        }
        return a+"/"+b+"="+(a/b);
    }
   }


//Написат 5 методов, которые при вызове из браузера делают следующее:
//
//  1. Метод по адресу /calculator должен вернуть приветствие “Добро пожаловать в калькулятор".
//
//        2. Метод по адресу /calculator/plus?num1=5&num2=5 должен сложить num1 и num2 и вернуть результат в формате “5 + 5 = 10”.
//
//        3. Метод по адресу /calculator/minus?num1=5&num2=5 должен вычесть из num1 num2 и вернуть результат в формате “5 − 5 = 0”.
//
//        4. Метод по адресу /calculator/multiply?num1=5&num2=5 должен умножить num1 на num2 и вернуть результат в формате “5 * 5 = 25”.
//
//        5. Метод по адресу /calculator/divide?num1=5&num2=5 должен разделить num1 на num2 и вернуть результат в формате “5 / 5 = 1”.