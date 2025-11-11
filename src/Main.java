import java.util.*;

public class Main {
    public static void main(String[] args) {
      HashMap<Integer,String> Hm = new HashMap<>();
      Hm.put(1,"Alvaro");
      Hm.put(2,"Rodrygo");
      System.out.println(Hm);
      Hm.remove(1,"Alvaro");
      System.out.println(Hm);



    }
}
