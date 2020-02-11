package calculator;

import java.io.IOException;
import calculator.StoreData;

class Calculate extends StoreData {
	char operation;
	int result;
	
	Calculate(int x, int y, char op){
		super(x, y, op);
		operation = op;
	}
	
	void result(int x, int y, char op) throws IOException {
        int result;
        switch(op){
            case '+':
                result = x + y;
                break;
            case '-':
                result = x - y;
                break;
            case '*':
                result = x * y;
                break;
            case '/':
                result = x / y;
                break;
            default:
                System.out.print("Ooops!! Choose the right operator!");
                return;
        }
        this.result = result;
        super.setResult(result);
        //System.out.print("%d %c %c = %d", x, op, y, result);
        System.out.print(x + " ");
        System.out.print(op + " ");
        System.out.print(y);
        System.out.print(" = " + result);
    }	
}