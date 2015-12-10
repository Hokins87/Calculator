package controller;

import java.net.URL;
import java.util.ResourceBundle;

import application.MathCalculator;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class MyController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {

	}

	double oper1 = 0, oper2 = 0, result = 0;
	String operation = "";

	@FXML
	private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

	@FXML
	private Button btnClear, btnPoint, btnResult, btnDivide, btnSum, btnSub, btnMultiply;

	@FXML
	private TextField txtField;

	/*
	 * public void addNum0(ActionEvent event) { if(btn0 == event.getSource()){
	 * if(txtField.getText().equals("0")){ txtField.setText(txtField.getText() +
	 * ""); }else{ txtField.setText(txtField.getText() + "0");
	 * System.out.println("0"); } } }
	 */

	public void btnClick(ActionEvent event) {
		btn0.setOnAction(new MyEvent());
		btn1.setOnAction(new MyEvent());
		btn2.setOnAction(new MyEvent());
		btn3.setOnAction(new MyEvent());
		btn4.setOnAction(new MyEvent());
		btn5.setOnAction(new MyEvent());
		btn6.setOnAction(new MyEvent());
		btn7.setOnAction(new MyEvent());
		btn8.setOnAction(new MyEvent());
		btn9.setOnAction(new MyEvent());
	}

	/*
	 * public void addNum1(ActionEvent event) {
	 * if(txtField.getText().equals("0")){ txtField.setText(""); }
	 * txtField.setText(txtField.getText() + "1"); System.out.println("1"); }
	 * 
	 * public void addNum2(ActionEvent event) {
	 * if(txtField.getText().equals("0")){ txtField.setText(""); }
	 * txtField.setText(txtField.getText() + "2"); System.out.println("2"); }
	 * 
	 * public void addNum3(ActionEvent event) {
	 * if(txtField.getText().equals("0")){ txtField.setText(""); }
	 * txtField.setText(txtField.getText() + "3"); System.out.println("3"); }
	 * 
	 * public void addNum4(ActionEvent event) {
	 * if(txtField.getText().equals("0")){ txtField.setText(""); }
	 * txtField.setText(txtField.getText() + "4"); System.out.println("4"); }
	 * 
	 * public void addNum5(ActionEvent event) {
	 * if(txtField.getText().equals("0")){ txtField.setText(""); }
	 * txtField.setText(txtField.getText() + "5"); System.out.println("5"); }
	 * 
	 * public void addNum6(ActionEvent event) {
	 * if(txtField.getText().equals("0")){ txtField.setText(""); }
	 * txtField.setText(txtField.getText() + "6"); System.out.println("6"); }
	 * 
	 * public void addNum7(ActionEvent event) {
	 * if(txtField.getText().equals("0")){ txtField.setText(""); }
	 * txtField.setText(txtField.getText() + "7"); System.out.println("7"); }
	 * 
	 * public void addNum8(ActionEvent event) {
	 * if(txtField.getText().equals("0")){ txtField.setText(""); }
	 * txtField.setText(txtField.getText() + "8"); System.out.println("8"); }
	 * 
	 * public void addNum9(ActionEvent event) {
	 * if(txtField.getText().equals("0")){ txtField.setText(""); }
	 * txtField.setText(txtField.getText() + "9"); System.out.println("9"); }
	 */

	public void clearDisplay(ActionEvent event) {
		System.out.println("Clear");
		txtField.setText("0");
	}

	public void addDivide(ActionEvent event) {
		System.out.println("Divide");
		oper1 = Double.valueOf(txtField.getText());
		txtField.setText("");
		operation = "/";
	}

	public void addMultiply(ActionEvent event) {
		System.out.println("Multiply");
		oper1 = Double.valueOf(txtField.getText());
		txtField.setText("");
		operation = "*";
	}

	public void addSubtract(ActionEvent event) {
		System.out.println("Subtract");
		oper1 = Double.valueOf(txtField.getText());
		txtField.setText("");
		operation = "-";
	}

	public void addSum(ActionEvent event) {
		System.out.println("Sum");
		oper1 = Double.valueOf(txtField.getText());
		txtField.setText("");
		operation = "+";
	}

	public void addPoint(ActionEvent event) {
		if (btnPoint == event.getSource()) {
			if (!txtField.getText().contains(".")) {
				txtField.setText(txtField.getText() + ".");
				System.out.println("Point");
			}
		}
	}

	public void result(ActionEvent event) {
		MathCalculator math = new MathCalculator();
		System.out.println("Result");
		oper2 = Double.valueOf(txtField.getText());
		txtField.setText("");
		if (operation.equals("/")) {
			math.divide(oper1, oper2);
		} else if (operation.equals("*")) {
			math.multiply(oper1, oper2);
		} else if (operation.equals("-")) {
			math.subtract(oper1, oper2);
		} else {
			math.sum(oper1, oper2);
		}
		txtField.setText(String.valueOf(oper1) + " " + operation + " " + String.valueOf(oper2) + " = "
				+ String.valueOf(math.getResult()));
	}

	class MyEvent implements EventHandler<ActionEvent> {

		@Override
		public void handle(ActionEvent event) {
			 Button btn = (Button) event.getSource();
			System.out.println(btn.getText());
			if (btn == btn0) {
				if (txtField.getText().equals("0")) {
					txtField.setText(txtField.getText() + "");
				} else {
					txtField.setText(txtField.getText() + "0");
					System.out.println("0");
				}
			} else if (btn == btn1) {
				if (txtField.getText().equals("0")) {
					txtField.setText("");
				}
				txtField.setText(txtField.getText() + "1");
				System.out.println("1");
			} else if (btn == btn2) {
				if (txtField.getText().equals("0")) {
					txtField.setText("");
				}
				txtField.setText(txtField.getText() + "2");
				System.out.println("2");
			} else if (btn == btn3) {
				if (txtField.getText().equals("0")) {
					txtField.setText("");
				}
				txtField.setText(txtField.getText() + "3");
				System.out.println("3");
			} else if (btn == btn4) {
				if (txtField.getText().equals("0")) {
					txtField.setText("");
				}
				txtField.setText(txtField.getText() + "4");
				System.out.println("4");
			} else if (btn == btn5) {
				if (txtField.getText().equals("0")) {
					txtField.setText("");
				}
				txtField.setText(txtField.getText() + "5");
				System.out.println("5");
			} else if (btn == btn6) {
				if (txtField.getText().equals("0")) {
					txtField.setText("");
				}
				txtField.setText(txtField.getText() + "6");
				System.out.println("6");
			} else if (btn == btn7) {
				if (txtField.getText().equals("0")) {
					txtField.setText("");
				}
				txtField.setText(txtField.getText() + "7");
				System.out.println("7");
			} else if (btn == btn8) {
				if (txtField.getText().equals("0")) {
					txtField.setText("");
				}
				txtField.setText(txtField.getText() + "8");
				System.out.println("8");
			} else if (btn == btn9) {
				if (txtField.getText().equals("0")) {
					txtField.setText("");
				}
				txtField.setText(txtField.getText() + "9");
				System.out.println("9");
			}
		}

	}
}
