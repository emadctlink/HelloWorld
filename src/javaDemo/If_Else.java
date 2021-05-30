package javaDemo;

public class If_Else {

	public static void main(String[] args) {
		
			//if statement----if condition is true then print, otherwise not print. check 20<10
			if (20>10) {
				System.out.println("20 is greater then 10");
			}

			//--------------------------------------
			
			// if else-- it will print which condition is true.
			if (25>35) {
				System.out.println("25 is greater then 35");
			}
			else {
				System.out.println("it's not true");
			}
			
			//---------------------------------------
			
			//Else if-----it will print which condition is true.
			int i = 50;
			
			if(i<50) {
				System.out.println("I is smaller then 50");
			}
			else if(i>50) {
				System.out.println("I is greater then 50");
			}
			else if (i!=50) {
				System.out.println("I is not equel to 50");
			}
			else {
				System.out.println("I equel to 50");
			}
		//-----------------------------------
			
			int age = 18;
			
			if(age<18) {
			System.out.println("you are kids");
			}
			else if (age>18) {
				System.out.println("you are adult");
			}
			else if(age >65) {
				System.out.println("you are old");
			}
			else if (age ==18) {
				System.out.println("you are Young");
			}
			else {
				System.out.println(" you are not in this criteria");
			}
			
		}


	}


