package ex;

import java.util.Scanner;

public class Calculator {
	public static void main(String args[]){
		MyCalc();
		showMenu();
		getNumbers();
		addNumbers();
		subNumbers();
		multNumbers();
		divNumbers();
		checkIfDigit();
		convertNumbers();
	}

	private static void convertNumbers() {
		
	}

	private static void checkIfDigit() {
		 
		
	}

	private static int getSecondNumbers() {
		System.out.println("input second number:\n");
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		return num1;
	}

	private static int getFirstNumbers() {
		System.out.println("input first number:");
		Scanner sc = new Scanner(System.in);
		int num2 = sc.nextInt();
		return num2;
	}

	private static void divNumbers() {
		 if (num3==4){
		 }
		
	}

	private static void multNumbers() {
		 if (num3==3){
		 }
	}

	private static void subNumbers() {
		 if(num3==2){
		 }
		
	}

	private static void addNumbers() {
		if(num3==1){
		}
	}

	private static void getNumbers() {
		 getFirstNumbers();
		 getSecondNumbers();
	}

	private static int showMenu() {
		System.out.println("please Selcet\n"
				+ "1.Add two integers\n"
				+"2. Subtract an integer from an integer\n"
				+"3. Multiply two integers\n"
				+"4. Divide an integer into an integer\n"
				+"5. Exit");
		Scanner sc = new Scanner(System.in);
		int num3 = sc.nextInt();
		return num3;
	}

	private static void MyCalc() {
		int num1,num2,num3,result = 0;
	}
		 
}