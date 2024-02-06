package lab;

public class Calculator {

	public double addition (double no1, double no2)
	{
		return no1 + no2;
	}
	
	public double mean (double [] numbers)
	{
		int length = numbers.length;
		double mean=0;
		for (int i=0 ; i< length; i++)
		{
			mean += numbers[i];
		}
		
		return mean/length;
	}
	
	public double variance (double [] numbers)
	{
		double mean= this.mean(numbers);
		int length = numbers.length;
		int sum = 0;
		
		for (int i=0 ; i< length; i++)
		{
			numbers[i] = numbers[i]-mean;
			numbers[i] = numbers[i]*numbers[i];
			sum += numbers[i];
		}
		
		return sum/length;
	}
	
	public double std(double [] numbers)
	{
		double std = Math.sqrt(this.variance(numbers));
		return std;	
	}
	

	public double substraction(double x, double y)
	{
		return (x-y);
		
	}
	
	public double multiply(double x, double y)
	{
		return (x*y);
		
	}
	
	public double division(double x, double y)
	{
		return (x/y);
		
	}
	
}
