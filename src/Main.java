
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
    Stack<Integer> Src = new Stack<>();
    Src.push(3);
    Src.push(4);
    Src.add(5);
    System.out.println(Src.peek());
    Src.pop();
    System.out.println(Src);
    }
}
