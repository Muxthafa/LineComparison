package com.practiceproblem;

import java.util.Scanner;

public class LineComp {
	public static int linelength(int x1,int y1,int x2,int y2) {
		return (int) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Wecome to line comparison problem");
		System.out.println("Enter the end points of the line 1:");
		Scanner sc = new Scanner(System.in);
		int x1=sc.nextInt();
		sc.nextLine();
		int y1=sc.nextInt();
		sc.nextLine();
		int x2=sc.nextInt();
		sc.nextLine();
		int y2=sc.nextInt();
		sc.nextLine();
		int len1 = linelength(x1,y1,x2,y2);
		System.out.println("length of line 1: "+len1);
		System.out.println("Enter the end points of the line 2:");
		x1=sc.nextInt();
		sc.nextLine();
		y1=sc.nextInt();
		sc.nextLine();
		x2=sc.nextInt();
		sc.nextLine();
		y2=sc.nextInt();
		sc.nextLine();
		int len2 = linelength(x1,y1,x2,y2);
		System.out.println("length of line 2: "+len2);
		if(len1 == len2)
			System.out.println("The lines are equal!!");
		else if(len1 > len2)
			System.out.println("The line 1 is greater than line 2");
		else
			System.out.println("Line 1 is lesser than line 2");
	}

}
