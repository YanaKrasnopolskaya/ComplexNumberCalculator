package model.calculate.impl;

import model.calculate.Calculator;

public class ComplexCalculatorStrategy implements Calculator<Complex> {

    @Override
    public Complex add(Complex a, Complex b) {
        Complex complexNum = new Complex();
        return new Complex(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
    }

    @Override
    public Complex subtract(Complex a, Complex b) {
        return new Complex(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
    }

    @Override
    public Complex multiply(Complex a, Complex b) {
        return new Complex(a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary(),
                a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal());
    }

    @Override
    public Complex divide(Complex a, Complex b) {
        try {
            double denominator = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();
            return new Complex((a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / denominator,
                    (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / denominator);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Divide by zero exception");
        }
    }

}

