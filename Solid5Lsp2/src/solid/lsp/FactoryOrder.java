package solid.lsp;

public class FactoryOrder {

    private int count = 0;

    public OrderAbstract create(int price, int qnt) {
        count++;
        if (count == 3){
            count = 0;
            return new OrderBonus(price, qnt);
        }
        return new Order(price, qnt);
    }
}
