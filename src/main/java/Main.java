import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Product> list = new ArrayList<Product>
                (Arrays.asList(
                 new Product("Mars", 10.5),
                 new Product("Twix", 11.00)));

        Machine machine = new Machine(list);
        String key = "Mars";
        System.out.println(machine.getProductByName(key));

        List<Product> listBottle = new ArrayList<Product>
                (Arrays.asList(
                        new Bottle("Coca-Cola", 1.0, 0.5),
                        new Bottle("Sprite", 2.0, 1.0)));

        Machine bottleMachine = new BottleMachine(listBottle);
        String keyBottle = "Sprite";
        System.out.println(bottleMachine.getProductByName(keyBottle));


        List<Product> listHotdrink = new ArrayList<Product>
                (Arrays.asList(
                        new Hotdrink("Black tea", 1.5, 0.25, 60.0),
                        new Hotdrink("Green tea", 1.25, 0.25, 60.0),
                        new Hotdrink("Americano coffee", 3.5, 0.25, 60.0),
                        new Hotdrink("Espresso coffee", 3.5, 0.25, 60.0),
                        new Hotdrink("Latte coffee", 4.5, 0.25, 60.0)));

        Machine hotdrinkMachine = new HotdrinkMachine(listHotdrink);
        String keyHotdrink = "Latte coffee";
        System.out.println(hotdrinkMachine.getProductByName(keyHotdrink));
    }

}
