package com.epam.vnrvjiet.nikhitha.task_calculator;

import java.util.Scanner;

public class Console {
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
