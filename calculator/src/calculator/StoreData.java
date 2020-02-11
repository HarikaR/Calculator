package calculator;

import java.io.FileWriter;
import java.io.IOException;

import calculator.Variables;

class StoreData extends Variables{
	char op;
	int r;
	private FileWriter fw;

	StoreData(int firstNumber, int secondNumber, char c) {
		super(firstNumber, secondNumber);
		this.op = c;
		// TODO Auto-generated constructor stub
	}
	 void setResult(int r) throws IOException{
		 this.r = r;
		 fw = new FileWriter("hist.txt");
		 fw.append(op);
		 fw.append((char)super.firstNumber);
		 fw.append((char)super.secondNumber);
		 fw.append("and result is");
		 fw.append((char)r);
	 }
}
