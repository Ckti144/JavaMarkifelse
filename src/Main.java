import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int StuMark = sc.nextInt();
    int AttPer = sc.nextInt();
    int FamInc = sc.nextInt();
    if(StuMark >= 85 && AttPer >=75 && FamInc<=200000){
        System.out.println("The Student is Eligible For The Scholarship");
    }
    else if (StuMark >= 90 && AttPer >=85){
        System.out.println("The Student Is Eligible For The Full Scholarship");
    }
    else if (StuMark >= 80 && AttPer >=70){
        System.out.println("The Student is Eligible For the Partial Scholarship");
    }
    else {
        System.out.println("Not Eligible for the Scholarship");
    }
    }
}
