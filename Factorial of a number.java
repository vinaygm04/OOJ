import java.util.Scanner;

public class Main{
	
	static int fact(int num){
		
		if(num == 1)
			return 1;
		
		return num * fact(num-1);
	}

	public static void main(String args[]){
		
		int num;
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a Number to find the factorial: ");
		num = scanner.nextInt();
		
		int ans =  fact(num);
		System.out.print("Factorial of "+num+" is "+ans);
		
	}
}
