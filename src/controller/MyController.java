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
import javafx.scene.layout.AnchorPane;

public class MyController implements Initializable {

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		MyEvent btnEvent = new MyEvent();
	    btn0.setOnAction(btnEvent);
	    btn1.setOnAction(btnEvent);
	    btn2.setOnAction(btnEvent);
	    btn3.setOnAction(btnEvent);
	    btn4.setOnAction(btnEvent);
	    btn5.setOnAction(btnEvent);
	    btn6.setOnAction(btnEvent);
	    btn7.setOnAction(btnEvent);
	    btn8.setOnAction(btnEvent);
	    btn9.setOnAction(btnEvent);
	}

	private double oper1 = 0, oper2 = 0;
	private String operation = "";

	@FXML
	private Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9;

	@FXML
	private Button btnClear, btnPoint, btnResult, btnDivide, btnSum, btnSub, btnMultiply;

	@FXML
	private TextField txtField;

	@FXML
	private AnchorPane lblDisplay;

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
			if (txtField.getText().equals("0")) {
				txtField.setText("");
			}
			txtField.setText(txtField.getText() + btn.getText());
			System.out.println(btn.getText());
		}

	}
}
