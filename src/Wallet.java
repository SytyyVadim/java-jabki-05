public class Wallet {
    private String owner;
    private int money;

    public Wallet(String owner, int money) {
        this.owner = owner;
        setMoney(money); // используем сеттер с валидацией
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        if (money < 0) {
            System.out.println("Ошибка: нельзя установить отрицательное количество денег.");
        } else {
            this.money = money;
        }
    }

    public void spend(int amount) {
        int total = amount + calculateFee(amount);
        if (total <= money) {
            money -= total;
        } else {
            System.out.println("Недостаточно средств.");
        }
    }

    protected int calculateFee(int amount) {
        return (int) (amount * 0.05); // 5% комиссия
    }
}
