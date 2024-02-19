package controller;

import model.calculate.Calculator;
import model.calculate.impl.Complex;
import model.logging.impl.FileLogger;

import java.io.IOException;
import java.time.LocalDateTime;

public class CalcController<E> {
    private  LocalDateTime time = LocalDateTime.now();;
    private Calculator<Complex> calculator;
    private FileLogger loggingService;

    public CalcController(Calculator<Complex> calculator) throws IOException  {
        this.calculator = calculator;
        this.loggingService = new FileLogger("C:\\Users\\Алиса\\Documents\\ООП\\ComplexNumberCalculator\\test.txt");
    }

    public Complex add(Complex a, Complex b) {
        Complex result = calculator.add(a, b);
        loggingService.log(time ,"Addition of complex numbers", result);
        return result;
    }

    public Complex multiply(Complex a, Complex b) {
        Complex result = calculator.multiply(a, b);
        loggingService.log(time, "Subtraction of complex numbers", result);
        return result;
    }

    public Complex subtract(Complex a, Complex b) {
        Complex result = calculator.subtract(a, b);
        loggingService.log(time, "Multiplication of complex numbers", result);
        return result;
    }

    public Complex divide(Complex a, Complex b) {
        Complex result = calculator.divide(a, b);
        loggingService.log(time, "Division of complex numbers", result);
        return result;
    }
}

