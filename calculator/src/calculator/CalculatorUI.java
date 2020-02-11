package calculator;

import java.io.IOException;
import java.util.Scanner;
import calculator.Calculate; 

public class CalculatorUI extends Calculate {
	private static Scanner reader;
	CalculatorUI(int a, int b, char op) {
		super(a, b, op);
		// TODO Auto-generated constructor stub
	}
	void result(int a, int b, char op) throws IOException {
		super.result(a, b, op);
	}
	public static void main(String[] args) throws IOException {
        reader = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int first = reader.nextInt();
        int second = reader.nextInt();
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        CalculatorUI cal = new CalculatorUI(first,second,operator);
        cal.result(first,second,operator);
        
	}
}