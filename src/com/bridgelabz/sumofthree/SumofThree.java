package com.bridgelabz.sumofthree;

import java.util.Scanner;

import com.bridgelabz.Utility.Utility;

public class SumofThree {

	public static void main(String agrs[]) {
			Scanner scanner  = new Scanner(System.in);
			System.out.println("Enter array size:");
			int number = scanner.nextInt();
			int array[] = new int[number];
			System.out.println("Input array elements:");
			for (int i = 0; i <number; i++) {
				array[i] = scanner .nextInt();
			}
			Utility.findTriplet(number, array);
			scanner.close();
		}

}