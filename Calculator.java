 import java.util.Scanner;		
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		MathEx mathobj = new MathEx();
		Scanner userinput = new Scanner(System.in);
		
		System.out.println("Java Calculator");
		System.out.println(" ");
		
		System.out.print("Enter the first number: ");
		int num1  = userinput.nextInt();
		
		System.out.print("Enter the second number: ");
		int num2  = userinput.nextInt();
		
		System.out.print("Enter the operation you would like to perform (+,-,/,*):");
		
		String operation= userinput.next();
		
		if(operation.equals("+"))
		{
			System.out.println(mathobj.Add(num1, num2));
		}
		if(operation.equals("-"))
		{
			System.out.println(mathobj.Subtract(num1, num2));
		}
		if(operation.equals("*"))
		{
			System.out.println(mathobj.Multiply(num1, num2));
		}
		if(operation.equals("/"))
		{
			System.out.println(mathobj.Divide(num1, num2));
		}
		
		
		
	}

}
