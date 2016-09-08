package com.a3.classes;

import java.util.Scanner;

public class A3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean same ;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the First String: ");
		String stringOne = scan.next();
		System.out.println("Enter the Second String: ");
		String stringTwo = scan.next();
		if (stringOne.equals(stringTwo))
		{
			same = true;
			System.out.println("The Value of Variable same is :" + same);
		}
		else 
		{
			same = false;
			System.out.println("The Value of Variable [same] is :" + same);
		}
	
	}

}
