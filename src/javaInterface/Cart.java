package javaInterface;

class Cart {
    private Product[] products;

    public Cart(Product[] products) {
        this.products = products;
    }

    public int calculateDeliveryCharge() {
        int totalWeight = 0;
        int totalPrice = 0;

        for (Product product : products) {
            totalWeight += product. getWeight();
            totalPrice += product.getDiscountedPrice();
        }
        int weightCharge;
        if (totalWeight < 3) {
            weightCharge = 1000;
        } else if (totalWeight < 10 ) {
            weightCharge = 5000;
        } else {
            weightCharge = 10000;
    }

        if ( totalPrice >= 100000) {
            return 0;
        } else if (totalPrice >= 30000) {
            return weightCharge -1000;
        }

        return weightCharge;
    }
}