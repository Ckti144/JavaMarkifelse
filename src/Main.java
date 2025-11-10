import java .util.Scanner;
class Even{
    public void showEven(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of the Wot:");
        String Wot = sc.nextLine();
        if (Wot.equals("Even")){
            for(int i =0;i<=100;i++){
                if (i%2 == 0) {
                    System.out.println("Even Number"+i);
                }
            }
        }
        else {
            System.out.println("Pass To The Another Class");
        }
    }
}

class ODD   {
    public void showODD(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Value of the Wot:");
        String WOt = sc.nextLine();
        if (WOt.equals("ODD")){
            for(int i =0;i<=100;i++){
                if (i%3 == 0) {
                    System.out.println("Even Number"+i);
                }
            }
        }
        else {
            System.out.println("No Input Matches The Class");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Even e1 = new Even();
        e1.showEven();
        ODD o1 = new ODD();
        o1.showODD();
    }
}
