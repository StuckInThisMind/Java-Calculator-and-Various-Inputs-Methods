package lab;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Input input = new Input();
		Scanner sc = new Scanner(System.in);
		Calculator calculator = new Calculator();
		
		System.out.println("Type 1 for Addition \nType 2 for Substraction \nType 3 for Multiple \nType 4 for Division \nType 5 for Mean \nType 6 for Variance \nType 7 for Standard Deviation");
	
		int opt = sc.nextInt();
		switch (opt)
		{
		case 1:
		
			double numbers[] = new double[2];
			
			numbers = input.inputNumbers();
			
			System.out.println("The addition of "+ numbers[0] + " and " + numbers[1] 
					+ " is " + calculator.addition(numbers[0],numbers[1]));
			break;
			
		case 5:
			
			System.out.println("Enter the number of element :" );
			int length = sc.nextInt();
			double numbers_mean[] = new double[length];
			numbers_mean = input.inputArray(length);
			System.out.println("The Mean is:"+ calculator.mean(numbers_mean));
			break;
			
		case 6:
			
			System.out.println("Enter the number of element :" );
			int length_var = sc.nextInt();
			double numbers_var[] = new double[length_var];
			numbers_var = input.inputArray(length_var);
			System.out.println("The Variance is :"+ calculator.variance(numbers_var));
			break;
		
		case 7:
			
			System.out.println("Enter the number of element :" );
			int length_std = sc.nextInt();
			double numbers_std[] = new double[length_std];
			numbers_std = input.inputArray(length_std);
			System.out.println("The std is :"+ calculator.std(numbers_std));
			break;
		
		case 3:
			// Multiple
			double numbers2[] = new double[2];
			numbers2 = input.inputNumbers();

			System.out.println("The multiplication of "+ numbers2[0] + " and " + numbers2[1] 
			        + " is " + calculator.multiply(numbers2[0],numbers2[1]));

			break;
		
		case 2:
			// Sub
			double numbers1[] = new double[2];
			numbers1 = input.inputNumbers();
			
			System.out.println("The substraction of "+ numbers1[0] + " and " + numbers1[1] 
					+ " is " + calculator.addition(numbers1[0],numbers1[1]));
			break;
		
		case 4:
			double numbers3[] = new double[2];
			numbers3 = input.inputNumbers();

			if(numbers3[1] != 0) {
			    System.out.println("The division of "+ numbers3[0] + " and " + numbers3[1] 
			            + " is " + calculator.division(numbers3[0],numbers3[1]));
			} else {
			    System.out.println("Cannot divide by zero!");
			}
	
		}
		
	}

}
