/**********************************************************************
Program Title : Input and Output Demonstration
File Name     : "InputOutput.java"

Programmer    : Sathish Sarma
Contact Details : sathish.sarma@newinti.edu.my
Date          : 2 September 2025
**********************************************************************/

import java.util.Scanner;

class InputOutput {

public static void main(String[] args) {

	Scanner myObj = new Scanner(System.in);
	
	System.out.println("Enter name and age :");

	String name = myObj.nextLine();
	int age = myObj.nextInt();
	
	System.out.println("Enter a number(double) :");
	double number = myObj.nextDouble();
	System.out.println("Enter an answer(boolean) :");
	boolean answer = myObj.nextBoolean();
	System.out.println("Enter a character:");
    char character = myObj.next().charAt(0); 
    
	System.out.println("Name: " + name);
	System.out.println("Age: " + age);
	System.out.println("Number: " + number);
	System.out.println("Answer: " + answer);
	System.out.println("Character: " + character);
	}
}