import java.awt.*;

class Totto {

    Totto(){
        Frame f1 = new Frame();

        Button b1 = new Button("Submit");

        f1.add(b1);
        f1.setLayout(new FlowLayout());
        f1.setSize(200,300);
        f1.setVisible(true);

    }
}

public class Main {
    public static void main(String[] args) {
        Totto t1 = new Totto();

    }
    }
