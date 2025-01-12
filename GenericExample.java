
public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void display() {
        System.out.println("First: " + first + ", Second: " + second);
    }

    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Age", 25);
        pair.display();
	System.out.println("GetFirst: "+pair.getFirst());
	System.out.println("GetSecond: "+pair.getSecond());

    }
}
