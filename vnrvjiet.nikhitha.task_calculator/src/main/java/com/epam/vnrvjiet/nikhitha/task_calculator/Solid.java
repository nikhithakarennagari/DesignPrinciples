package com.epam.vnrvjiet.nikhitha.task_calculator;

import java.util.Scanner;

public class Solid {
	public void add(float a, float b)
	{
		
		System.out.println("The sum is "+(a+b));
	}
	public void subtract(float a , float b)
	{
		System.out.println("The difference is "+ (a-b));
	}
	public void multiply(float a,float b)
	{
		System.out.println("The product is "+(a*b));
	}
	public void divide(float a,float b)
	{
		System.out.println("The quotient is "+(a/b));
	}
	
	public static void main(String args[])
	{
		float a,b;
		char op;
		System.out.println("Enter values of a,b and operator");
		Scanner sc=new Scanner(System.in);
		a=sc.nextFloat();
		b=sc.nextFloat();
		op=sc.next().charAt(0);
		sc.close();
		MathsOperations m=new MathsOperations();
		if(op=='+')
		m.add(a, b);
		else if(op=='-')
		m.subtract(a, b);
		else if(op=='*')
		m.multiply(a, b);
		else
		m.divide(a, b);
	}

}
