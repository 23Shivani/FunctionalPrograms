package com.bridgelabz.Utility;

public class Utility {
	
	public static void findDistance(int initial1, int initial2, int final1, int final2) {
		double distance;
		distance = Math.sqrt((initial1 * final1) + (initial2 * final2));
		System.out.println("Distance between initial and final points" + distance);
		System.out.println("" + Math.round(distance * 10000.0) / 10000.0);

	}

}