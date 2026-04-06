public final class Order {
    private final Stock stock;
    private final int quantity;
    private final long price;

    public Order(Stock stock, int quantity, long price) {
        if (stock == null) throw new IllegalArgumentException("주식 정보 필수");
        if (quantity <= 0 || price <= 0) throw new IllegalArgumentException("수량/가격은 0보다 커야 함");
        this.stock = stock;
        this.quantity = quantity;
        this.price = price;
    }

    public Stock getStock() { return stock; }
    public int getQuantity() { return quantity; }
    public long getPrice() { return price; }
}