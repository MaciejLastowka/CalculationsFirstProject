package pl.great.waw.calculations;

import java.math.BigDecimal;

public class Product {

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;

    }

    private String name;
    private BigDecimal price;

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name = '" + name + '\'' +
                ", price = " + price +
                '}';
    }

}
