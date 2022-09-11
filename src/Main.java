import com.composite.Component;
import com.composite.Composite;
import com.composite.Leaf;

public class Main {

    public static void main(String[] args) {
        Composite cp =new Leaf(400, "hd");
        Composite cp1 = new Leaf(500,"ram");
        Composite cp3 =new Leaf(600, "cpu");

        Component cp4 = new Component("motherboard");
        cp4.add(cp1);
        cp4.add(cp3);

        Component cp5 = new Component("cabinet");
        cp5.add(cp4);

        Component cp7 = new Component("op");
        cp7.add(cp);

        Component cp6 = new Component("computer");
        cp6.add(cp5);
        cp6.add(cp7);
        cp6.price();


    }
}
