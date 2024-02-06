import java.io.*;
import java.util.*;

public class FibonacciSeries {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        DataInputStream dataInputStream = new DataInputStream(System.in);
        Console console = System.console();
        
        System.out.println("Menu:");
        System.out.println("1. Command Line Arguments");
        System.out.println("2. Scanner");
        System.out.println("3. BufferedReader");
        System.out.println("4. DataInputStream");
        System.out.println("5. Console");
        System.out.print("Enter your choice: ");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                if (args.length != 1) {
                    System.out.println("Usage: java FibonacciSeries <limit>");
                    return;
                }
                generateFibonacci(Integer.parseInt(args[0]));
                break;
                
            case 2:
                System.out.print("Enter the limit: ");
                int limit1 = scanner.nextInt();
                generateFibonacci(limit1);
                break;
                
            case 3:
                try {
                    System.out.print("Enter the limit: ");
                    int limit2 = Integer.parseInt(bufferedReader.readLine());
                    generateFibonacci(limit2);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
                
            case 4:
                try {
                    System.out.print("Enter the limit: ");
                    int limit3 = Integer.parseInt(dataInputStream.readLine());
                    generateFibonacci(limit3);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
                
            case 5:
                if (console == null) {
                    System.out.println("Console is not available");
                    return;
                }
                String limitStr = console.readLine("Enter the limit: ");
                int limit4 = Integer.parseInt(limitStr);
                generateFibonacci(limit4);
                break;
                
            default:
                System.out.println("Invalid choice");
        }
    }
    
    private static void generateFibonacci(int limit) {
        int n1 = 0, n2 = 1;
        System.out.print("Fibonacci Series up to " + limit + " terms: ");
        for (int i = 1; i <= limit; ++i) {
            System.out.print(n1 + " ");
            int sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
