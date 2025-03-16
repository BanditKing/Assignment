package javaInterface;


abstract class Product implements Promotion {
    private final String name;
    private final int price;
    private final int weight;
    private final int discount;

    public Product(String name, int price, int weight, int discount) {
        this.name = name;
        this.price = price;
        this.weight = weight;
        this.discount = discount;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int getDiscountAmount() {
        return discount;
    }

    public int getDiscountedPrice() {
        return price - getDiscountAmount();
    }
}