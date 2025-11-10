class Parent {
    String Intelligence = "SuperPower";
    String Metabolism = "Fast";
    void showAbilities(){
        System.out.println("The Intelligence he Posses is"+Intelligence);
        System.out.println("The Metabolism He posses is"+Metabolism);
    }
}

class Child extends Parent{
    void showAbilities(){
        super.showAbilities();
    }
}
public class Main {
    public static void main(String[] args) {
        Child P1 = new Child();
        P1.showAbilities();
    }
}
