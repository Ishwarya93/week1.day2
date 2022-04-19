package day2;

public class LearnMethod {
	public static void main(String[] args) {
		LearnMethod LM = new LearnMethod();
		LM.carName();
		int RegNumber = LM.getCarRegNumber();
				System.out.println(RegNumber);
				String Varient = LM.getCarVarient();
						System.out.println(Varient);
						int Multiply = LM.multiplyTwoNumbers(7, 4);
						System.out.println(Multiply);
						
	}
	
	public void carName() {
		System.out.println("Benz");
	}
	public int getCarRegNumber() {
		int CarRegNumber = 4011;
		return CarRegNumber;
	}
	public String getCarVarient() {
		return "petrol";
	}
	public int multiplyTwoNumbers(int a, int b) {
		return a*b;
	}

}

