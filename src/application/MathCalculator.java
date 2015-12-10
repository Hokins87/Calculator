package application;

public class MathCalculator {

	private double result;

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public double divide(double a, double b) {
		result = a / b;
		return result;
	}

	public double multiply(double a, double b) {
		result = a * b;
		return result;
	}

	public double subtract(double a, double b) {
		result = a - b;
		return result;
	}

	public double sum(double a, double b) {
		result = a + b;
		return result;
	}
}
