package com.anand.oneline;

import java.io.*;
import java.util.Scanner;

public class Int2string {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		
		String s= Integer.toString(n);// ************1st method
		// String s=String.valueOf(n);// ************2nd method
		
		System.out.println("The String is "+s);

	}

}
