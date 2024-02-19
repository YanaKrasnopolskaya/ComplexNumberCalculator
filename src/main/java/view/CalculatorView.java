package view;

import java.util.Scanner;

import controller.CalcController;
import model.calculate.impl.Complex;
import util.DataEntry;

public class CalculatorView {
    private CalcController calcController;
    private final DataEntry input;

    public CalculatorView(CalcController calcController, DataEntry input){
        this.calcController = calcController;
        this.input = input;
    }

    public void run() {
        while (true) {
            prepare();
            String action = input.prompt();
            if (action.equalsIgnoreCase("q")) {
                System.exit(0);
            } else{
                prepare();
            }
        }
    }
    private void prepare(){
        double aReal = input.prompt("Enter the real number A: ");
        double aImaginary = input.prompt("Enter the imaginary number A: ");
        String operator = input.getOperator();
        double bReal = input.prompt("Enter the real number B: ");
        double bImaginary = input.prompt("Enter the imaginary number B: ");

        Complex real = new Complex(aReal, aImaginary);
        Complex imaginary = new Complex(bReal, bImaginary);
        Complex result;

        switch (operator) {
            case "+":
                result = calcController.add(real, imaginary);
                System.out.println("Result: " + result.toString());
                break;
            case "-":
                result = calcController.subtract(real, imaginary);
                System.out.println("Result: " + result.toString());
                break;

            case "*":
                result = calcController.multiply(real, imaginary);
                System.out.println("Result: " + result.toString());
                break;

            case "/":
                result = calcController.divide(real, imaginary);
                System.out.println("Result: " + result.toString());
                break;

            default:
                System.out.println("Incorrect operator. Try again.");
                break;
        }
    }


}
