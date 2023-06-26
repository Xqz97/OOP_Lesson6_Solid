package solid;

import solid.srp.models.FactoryCreator;
import solid.srp.models.Order;
import solid.srp.models.SaveToJson;
import solid.srp.models.Savetable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите заказ:");
        Order order = new FactoryCreator().inputFromConsole();
        new SaveToJson(order).save();
    }
}
