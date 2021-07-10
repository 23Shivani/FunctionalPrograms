package com.bridgelabz.quadratic;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class Quadratic {

	public static void main(String[] args)
		{
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter first input value");
			int a=scanner.nextInt();
			System.out.println("Enter second input value");
			int b=scanner.nextInt();
			System.out.println("Enter third input value");
			int c=scanner.nextInt();
			scanner.close();
			Utility utility = new Utility();
			System.out.println(utility.root(a,b,c));
		}
}
