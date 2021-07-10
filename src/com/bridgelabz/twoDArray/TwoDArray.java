package com.bridgelabz.twoDArray;

import java.io.PrintWriter;
import java.util.Scanner;
import com.bridgelabz.Utility.Utility;

public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Scanner scanner=new Scanner(System.in);
				PrintWriter writer = new PrintWriter(System.out, true);
				writer.println("Input M rows:");
				int rows = scanner.nextInt();
				writer.println("Input N columns:");
				int columns = scanner.nextInt();
				//String[][] array = new String[rows][columns];
				writer.println("Enter your choice:" + "\n" + "Press 1 for Integer.." + "\n" + "Press 2 for Double.." + "\n" + "Press 3 for Boolean...");
				int choice=scanner.nextInt();
				switch(choice)
				{
				case 1:
					Integer[][] array=new Integer[rows][columns];
					Utility.inputArray(array, rows, columns);
					break;
				case 2:
					Double doubleArray[][]=new Double[rows][columns];
					Utility.inputArray(doubleArray, rows, columns);
				case 3:
					Boolean booleanArray[][]=new Boolean[rows][columns];
					Utility.inputArray(booleanArray, rows, columns);
					
				default:
					writer.println("Invalid option:");
					
				}
				scanner.close();
			}
	}
