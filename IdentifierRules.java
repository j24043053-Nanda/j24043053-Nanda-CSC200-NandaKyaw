/**********************************************************************
  
  Program Title : Demonstrating Identifier Rules in Java
  File Name: "IdentifierRules.java"
  
  Programmer : Sathish Sarma
  Contact Details : sathish.sarma@newinti.edu.my
  Date : 04 September 2025
  
 **********************************************************************/
 
// Intentionally incorrect program to demonstrate invalid Java identifiers.

class Switch{
	String SwitchStatus = "On";
	
}

public class IdentifierRules {
	
    /*public static void 1start() { ***identifier starts with number***
		//System.out.println("Static Method Output");
	}*/
	    public static void start() { 
		System.out.println("Static Method Output");
	}

    public static void main(String[] args) {

        //int 2ndPlace = 2; ***identifier starts with number***
        int Place2nd = 2; 

        //int first name = 10; ***identifier has a white space***
        int first_name = 10;

        //int price# = 99; ***identifier has a special character***
        int price = 99;
        
		//int user-name = 25; ***identifier has a special character***
		int username = 25;

        //int class = 1; ***used reserved word as identifier***
		int classs = 1;
		
		//int double = 3; ***used reserved word as identifier***
		int doublee = 3;
        
        //int Score = 10; ***identifier name didnt align with the call method***
        int score = 10;
        System.out.println(score);
		
		System.out.println("This program is executed after all errors are rectified.");


        //1start(); ***didn't align with identifier***
        start();
    }


}
