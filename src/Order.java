import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {

    private final String orderId;
    private final List<OrderItem> items;
    private double totalPrice;

    public Order() {
        this.orderId = UUID.randomUUID().toString();
        this.items = new ArrayList<>();
        this.totalPrice = 0.0;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void addItem(OrderItem item) {
        if (item != null) {
            items.add(item);
            totalPrice += item.getPrice();
        }
    }

    public List<OrderItem> getItems() {
        return new ArrayList<>(items);
    }

    public String getOrderSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order ID: ").append(orderId).append("\n");
        sb.append("Items:\n");
        for (OrderItem item : items) {
            sb.append("- ").append(item.getName()).append(" (").append(item.getPrice()).append(")\n");
        }
        sb.append("Total Price: ").append(totalPrice).append("\n");
        return sb.toString();
    }
}
