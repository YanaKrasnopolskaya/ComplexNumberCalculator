package org.example;

import java.io.IOException;
import java.util.Scanner;
import controller.CalcController;
import model.calculate.Calculator;
import model.calculate.impl.Complex;
import model.calculate.impl.ComplexCalculatorStrategy;
import util.DataEntry;
import view.CalculatorView;

public class Main {

    public static void main(String[] args) throws IOException {

        Calculator<Complex> calc = new ComplexCalculatorStrategy();
        CalcController<Complex> calcController = new CalcController<>(calc);

        CalculatorView calculatorView = new CalculatorView(calcController, new DataEntry(new Scanner(System.in)));
        calculatorView.run();

    }
}