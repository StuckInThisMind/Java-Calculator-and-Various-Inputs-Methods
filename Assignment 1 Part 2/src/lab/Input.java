package lab;

import java.util.Scanner;
public class Input {

	public double[] inputNumbers()              //GIVES TWO NUMBER FILLED ARRAY
	{
		
		Scanner sc = new Scanner(System.in);   // We are creating input 
		double numbers[] = new double[2];		// Creating an  array
		System.out.println("Enter First Number");
		double firstNo = sc.nextDouble();			//Scanner ka first number
		System.out.println("Enter Second Number");
		double secondNo = sc.nextDouble();		//Scanner ka second number
		numbers[0] = firstNo;
		numbers[1] = secondNo;
		return numbers;
		
	}
	
	public double[] inputArray(int length)   
	{
		double numbers[] = new double[length];
		Scanner sc = new Scanner (System.in);
		for (int i=0 ; i< length; i++)
		{
			System.out.println("Enter Element "+ (i+1) + " :");
			numbers[i] = sc.nextDouble();
		}
		
		return numbers;
	
	}
}