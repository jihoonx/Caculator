package quiz;
import java.util.Scanner;

public class Calculator {
		public static void main(String args[]){
			String num1=null, num2=null;
			int menunum;
			
			MyCalc();
			
			showMenu();
			Scanner sc = new Scanner(System.in);
			int menuNum = sc.nextInt();
			getNumbers();
			
			String x=num1;
			String y=num2;
			
			switch(menuNum){
				case 1:
					addNumbers(num1, num2);
				case 2:
					subNumbers(num1, num2);
					break;
				case 3:
					multNumbers(num1, num2);
					break;
				case 4:
					divNumbers(num1, num2);
					break;
				case 5:
					break;
			}
			

		private static void MyCalc() {
			int menunum=0;
		}

		private static void convertNumbers() {
		}

		private static void checkIfDigit() {
			 
		}

		static String getSecondNumbers() {
			System.out.println("input second number:\n");
			Scanner sc = new Scanner(System.in);
			String num2 = sc.nextLine();
			return num2;
		}

		static String getFirstNumbers() {
			System.out.println("input first number:");
			Scanner sc = new Scanner(System.in);
			String num1=sc.nextLine();
			return num1;
		}

		private static void divNumbers(String num1, String num2) {
			System.out.println(num1+" / "+ num2 + " = " + num1 / num2);
			
		}

		private static void multNumbers(String num1, String num2) {
			System.out.println(num1+" * "+ num2 + " = " + num1 * num2);
		}

		private static void subNumbers(String num1, String num2) {
			System.out.println(num1+" - "+ num2 + " = " + num1 - num2);
		}

		private static void addNumbers(String num1, String num2) {
			System.out.println(num1+" + "+ num2 + " = " + num1 + num2);
		}

		private static void getNumbers() {
			 getFirstNumbers();
			 getSecondNumbers();
		}

		private static void showMenu() {
			System.out.println("please Selcet\n"
					+ "1. Add two integers\n"
					+"2. Subtract an integer from an integer\n"
					+"3. Multiply two integers\n"
					+"4. Divide an integer into an integer\n"
					+"5. Exit");
		}
}
		
