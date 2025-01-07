import java.util.Scanner;

public class QuadraticEquationSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter coefficient a: ");
        double a = scanner.nextDouble();
        
        System.out.print("Enter coefficient b: ");
        double b = scanner.nextDouble();
        
        System.out.print("Enter coefficient c: ");
        double c = scanner.nextDouble();

 
        double discriminant = b * b - 4 * a * c;
        if(a==0){
		System.out.println("not a quadratic equation");}
			

       
        else if (discriminant > 0) {
            
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The solutions are real and different:");
            System.out.println("Root 1: " + root1);
            System.out.println("Root 2: " + root2);
        } else if (discriminant == 0) {
            
            double root = -b / (2 * a);
            System.out.println("There is one real solution:");
            System.out.println("Root: " + root);
        } else {
           
            System.out.println("There are no real solutions.");

        }
		System.out.println("lakshminivas h")
		System.out.println("1BM23CS165")
		

        
        scanner.close();
    }
}
