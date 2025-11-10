import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hash = new HashSet<>();
        hash.add(2);
        hash.add(3);
        hash.add(2);
        System.out.println(hash);
        hash.remove(3);
        System.out.println(hash);
    }
}
