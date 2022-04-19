package day2;

public class Calculator {
public static void main(String[] args) {
	Calculator Cal = new Calculator();
	int add = Cal.addThreeNumbers(2, 3, 4);
	System.out.println("Addition of 3 numbers:" + add);
	int Sub = Cal.SubTwoNumbers(5, 3);
	System.out.println("Substraction of 2 numbers:" + Sub);
	double mul = Cal.multiplyTwoNumbers(10, 20);
	System.out.println("multiplication of 2 numbers:" + mul);
	float division = Cal.divideTwoNumbers(4, 2);
	System.out.println("division of 2 numbers:" + division);
	
}



public void MyCalculator() {
}
	public int addThreeNumbers(int a, int b, int c) {
		return a+b+c;
	}
	public int SubTwoNumbers(int c, int d) {
		return c-d;
	}
	public double multiplyTwoNumbers(double x, double y) {
		return x*y;
	}
	public float divideTwoNumbers(float m, float n) {
		return m/n;
	}
}