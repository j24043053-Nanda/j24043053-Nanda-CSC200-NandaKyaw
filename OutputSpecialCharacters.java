/**********************************************************************
  
  Program Title  : Display Special Characters in Java
  File Name      : "OutputSpecialCharacters.java"
  
  Programmer     : Sathish Sarma
  Contact Details: sathish.sarma@newinti.edu.my
  Date           : 25 August 2025
  
 **********************************************************************/

public class OutputSpecialCharacters {
    public static void main(String[] args) {
		
		/*****
		Update the code below to ensure all special characters are placed accordingly and correctly.
		The string XYZ is used as the placeholder for the special characters.
		Replace all println with print and use suitable special character as replacement.
		*****/

        System.out.println("Demonstrating Special Characters in Java");
        System.out.println("---------------------------------------");

        // New line
        System.out.print("New line example: \n Hello \n World \n ");

        // Tab
        System.out.print("Tab example: \t Java \t Programming \t");
		System.out.println();

        // Backslash
        System.out.print("Backslash: \\ ");

        // Double quote
        System.out.print("Double quote: \" Hello \"");

        // Single quote
        System.out.print("Single quote: \'\' ");

        // Carriage return
        System.out.print("Carriage return example: \r");
        System.out.print("Original Line \r Overwritten line \r");
		System.out.println();

        // Backspace
        System.out.print("Backspace example: ABC \b D");

        // Form feed (note: effect depends on system/console)
        System.out.print("Form feed example: First page \f Second page");

    }
}