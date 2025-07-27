//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Wallet myWallet = new Wallet("dddd", 10);
        System.out.println("Владелец: " + myWallet.getOwner());

        Order order = new Order();

        order.addItem(new OrderItem("Смартфон", 1899.99));
        order.addItem(new OrderItem("Чехол", 119.99));

        System.out.println(order.getOrderSummary());
    }
}