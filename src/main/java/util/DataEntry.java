package util;

import java.util.Scanner;

public class DataEntry {
    private final Scanner scanner;

    public DataEntry(Scanner scanner) {
        this.scanner = scanner;
    }

    public double prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.nextDouble();
    }

    public String getOperator() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the math operation (*, +, /, -) : ");
        String operator = scanner.nextLine();
        return operator;
    }

    public String prompt() {
        Scanner in = new Scanner(System.in);
        System.err.println("press any key to continue");
        System.err.println("to exit press q");
        return in.nextLine();
    }
}
