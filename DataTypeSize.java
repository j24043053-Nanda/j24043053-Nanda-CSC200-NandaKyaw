/**********************************************************************
  
  Program Title : Demonstrating Variable Data Types in Java with Sizes
  File Name: "DataTypeSize.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 28 August 2025
  
 **********************************************************************/

public class DataTypeSize {
    public static void main(String[] args) {
        System.out.println("Demonstrating Data Type Size in Java");
        System.out.println("-----------------------------------------");

        byte b = 120;
        short s = 32000;
        int i = 123456789;
        long l = 9876543210L;
        float f = 5.75f;
        double d = 19.99;
        char c = 'A';
		
		//Instruction
		System.out.println("This application shows the basic code that is needed to calculate data type size, the range (min & max value) for each data type.");
		
		//Finding data type size using BYTES
		System.out.println("The variable b is byte data type has the value " + b + "\nSize of byte: " + Byte.BYTES);
		System.out.println("The variable s is short data type has the value " + s + "\nSize of short: " + Short.BYTES);
		System.out.println("The variable i is int data type has the value " + i + "\nSize of int: " + Integer.BYTES);
		System.out.println("The variable l is long data type has the value " + l + "\nSize of long: " + Long.BYTES);
		System.out.println("The variable f is float data type has the value " + f + "\nSize of float: " + Float.BYTES);
		System.out.println("The variable d is double data type has the value " + d + "\nSize of double: " + Double.BYTES);
		System.out.println("The variable c is char data type has the value " + c + "\nSize of char: " + Character.BYTES);
		System.out.println("\n");
		
		//Finding data type size using SIZE
		System.out.println("The variable b is byte data type has the value " + b + "\nSize of byte: " + Byte.SIZE);
		System.out.println("The variable s is short data type has the value " + s + "\nSize of short: " + Short.SIZE);
		System.out.println("The variable i is int data type has the value " + i + "\nSize of int: " + Integer.SIZE);
		System.out.println("The variable l is long data type has the value " + l + "\nSize of long: " + Long.SIZE);
		System.out.println("The variable f is float data type has the value " + f + "\nSize of float: " + Float.SIZE);
		System.out.println("The variable d is double data type has the value " + d + "\nSize of double: " + Double.SIZE);
		System.out.println("The variable c is char data type has the value " + c + "\nSize of char: " + Character.SIZE);
		System.out.println("\n");
		
		//Finding data type range minimum and maximum value
		System.out.println("The variable b is byte data type has the ranges of " + "\nMinimum value of byte range: " + Byte.MIN_VALUE + "\nMaximum value for byte range: " + Byte.MAX_VALUE + ".");
		System.out.println("The variable s is short data type has the ranges of " + "\nMinimum value of short range: " + Short.MIN_VALUE + "\nMaximum value for short range: " + Short.MAX_VALUE + ".");
		System.out.println("The variable i is int data type has the ranges of " + "\nMinimum value of int range: " + Integer.MIN_VALUE + "\nMaximum value for int range: " + Integer.MAX_VALUE + ".");
		System.out.println("The variable l is long data type has the ranges of " + "\nMinimum value of long range: " + Long.MIN_VALUE + "\nMaximum value for long range: " + Long.MAX_VALUE + ".");
		System.out.println("The variable f is float data type has the ranges of " + "\nMinimum value of float range: " + Float.MIN_VALUE + "\nMaximum value for float range: " + Float.MAX_VALUE + ".");
		System.out.println("The variable d is double data type has the ranges of " + "\nMinimum value of double range: " + Double.MIN_VALUE + "\nMaximum value for double range: " + Double.MAX_VALUE + ".");
		System.out.println("The variable c is char data type has the ranges of " + "\nMinimum value of char range: " + Character.MIN_VALUE + "\nMaximum value for char range: " + Character.MAX_VALUE + ".");
        
    }
}