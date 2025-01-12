public class Example {
  
    static int staticVariable = 0;
    

    int instanceVariable;

   
    public Example(int value) {
        this.instanceVariable = value;
    }

    public void increment() {
        staticVariable++; // Increment static variable
        instanceVariable++; // Increment instance variable
    }

    public void display() {
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Instance Variable: " + instanceVariable);
    }

    public static void main(String[] args) {
        Example obj1 = new Example(5);
        Example obj2 = new Example(10);

        obj1.increment();
        obj1.display();

        obj2.increment();
        obj2.display();
    }
}
