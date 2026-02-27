import java.util.Scanner;
	/**
		* File: Lesson 1.6 - Booleans
		* Author: Benson Zheng
		* Date Created: February 13, 2023
		* Date Last Modified: February 20, 2026
		*/
public class PracticeProblem {


	public static void main(String args[]) {
		q1();
		q2();
		q3();
		q4();
		q5();
		q6();
	}

	public static void q1() {
	Scanner input = new Scanner(System.in);
	boolean bool1;
	bool1 = true || false;
	System.out.print("Input a boolean: ");
	bool1 = input.nextBoolean();
	System.out.println(bool1);
	input.close();


	
	}

	public static void q2() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input an integer: ");
	Integer num1 = input.nextInt();
	System.out.println(num1 > 5);
	input.close();
	}

	public static void q3() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input pizza: ");
	String pizza = input.nextLine();
	System.out.println(pizza.equals("pizza"));
	input.close();
	}

	public static void q4() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input a number: ");
	Double num1 = input.nextDouble();
	System.out.println(num1 == 0);
	input.close();
	}

	public static void q5() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input an integer: ");
	Integer num1 = input.nextInt();
	System.out.println(num1 != 0);
	input.close();
	}

	public static void q6() {
	Scanner input = new Scanner(System.in);
	System.out.print("Input a word earlier than google: ");
	String str1 = input.nextLine();
	char inputChar1 = str1.charAt(0);
	System.out.println(inputChar1 < 103);
	input.close();

	}

}
