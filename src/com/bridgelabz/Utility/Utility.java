package com.bridgelabz.Utility;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Utility {
	public static void findDistance(int initial1, int initial2, int final1, int final2) {
		double distance;
		distance = Math.sqrt((initial1 * final1) + (initial2 * final2));
		System.out.println("Distance between initial and final points" + distance);
		System.out.println("" + Math.round(distance * 10000.0) / 10000.0);
		
	}
	
	public void writeToFile(String data,String fileName)throws Exception{
		File file = new File(fileName);
		if (!file.exists()) {
			file.createNewFile();
		}
		FileWriter writer = new FileWriter(file); 
		// Writes the content to the file
		writer.write(data); 
		writer.flush();
		writer.close();
	}

	public static void inputArray(Integer[][] array, int rows, int columns) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scanner.nextInt();
			}
		}
		Utility.printArray(array, rows, columns);
		scanner.close();
		}
	public static void inputArray(Double array[][], int rows, int columns) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scanner.nextDouble();
			}
		}
		Utility.printArray(array, rows, columns);
		scanner.close();
		}
	public static void inputArray(Boolean array[][], int rows, int columns) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Array elements");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				array[i][j] = scanner.nextBoolean();
			}
		}
		Utility.printArray(array, rows, columns);
		scanner.close();
		}
	public static <E> void printArray(E[][] array, int rows, int columns) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Array elements are:");
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println(" ");
		}
		scanner.close();
		}
}