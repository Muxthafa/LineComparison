package com.practiceproblem;

import java.util.Scanner;

public class LineComp {
	//class members
	private int x1;
	private int y1;
	private int x2;
	private int y2;
		
	//parameterized constructor
	public LineComp(int x1,int y1,int x2,int y2)
	{
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
	public double linelength() {
		return Math.pow(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1)),0.5);
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
//		int len1 = linelength(x1,y1,x2,y2);
		//object is created with parameters obtained by user
		LineComp len1 = new LineComp(x1,y1,x2,y2);
		System.out.println("Enter the end points of the line 2:");
		x1=sc.nextInt();
		sc.nextLine();
		y1=sc.nextInt();
		sc.nextLine();
		x2=sc.nextInt();
		sc.nextLine();
		y2=sc.nextInt();
		sc.nextLine();
		//object is created with parameters obtained by user
		LineComp len2 = new LineComp(x1,y1,x2,y2);
//		int len2 = linelength(x1,y1,x2,y2);
		
		double lengthofline;
		lengthofline = len1.linelength();
		System.out.println("The length of the line 1  is "+lengthofline);
		
		//converted to object
		Double length_line1 = new Double(lengthofline);
		lengthofline = len2.linelength();
		
		System.out.println("The length of the line2  is "+lengthofline);
		//length is converted to an object
		Double length_line2 = new Double(lengthofline);
		
		if(length_line1.equals(length_line2))			//equals method used to check equility two objects
			System.out.println("The lines are equal");
		else
		{
			//compareTo method used to compare two objects
			int result = length_line1.compareTo(length_line2);
			if(result == 1)
				System.out.println("line1 is greater than line2");
			else if(result==-1)
				System.out.println("Line2 is greater than line1");
		}
	}

}
