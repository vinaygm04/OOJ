import java.util.Scanner;

public class Box {
    int height;
    int width;

    Box(int height, int width) {
        this.height = height;
        this.width = width;
    }

    int calculateArea() {
        return this.height * this.width;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of Box1: ");
        int height = sc.nextInt();

        System.out.print("Enter the width of Box1: ");
        int width = sc.nextInt();

        Box box1 = new Box(height, width);
        System.out.println("Area of Box1: " + box1.calculateArea());
    }
}

class ChildBox extends Box {
    ChildBox(int height, int width) {
        super(height, width);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the height of ChildBox: ");
        int height = sc.nextInt();

        System.out.print("Enter the width of ChildBox: ");
        int width = sc.nextInt();

        ChildBox childBox1 = new ChildBox(height, width);
        System.out.println("Area of ChildBox: " + childBox1.calculateArea());
    }
}
