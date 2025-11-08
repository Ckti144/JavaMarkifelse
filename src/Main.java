import java.util.Scanner;

class  add{
    public void showadd() {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("The Addition of the Two Numbers is:"+c);
}
    }

class  sub{
    public void showsub() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number:");
        int a = sc.nextInt();
        System.out.println("Enter the Second Number");
        int b = sc.nextInt();
        int c = a - b;
        System.out.println("The Subraction of the Two Numbers is"+c);
    }
}

public class Main {
    public static void main(String[] args) {
                add a1 = new add();
                a1.showadd();
                sub s1 = new sub();
                s1.showsub();
    }
}
