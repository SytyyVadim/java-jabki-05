public class OrderItem {
    private final String name;
    private final double price;

    public OrderItem(String name, double price) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Название товара не может быть пустым.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Цена товара не может быть отрицательной.");
        }
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }
}
