package supermarket.domain;

import java.time.LocalDate;

public class Product {
    
    private int id;
    private String category;
    private String name;
    private String brand;
    private int stock;
    private LocalDate expirationDate;
    private double discountPercentage;
    private double price;

    public Product(String category, String name, String brand, int stock, LocalDate expirationDate,
            double discountPercentage, double price) {
        this.category = category;
        this.name = name;
        this.brand = brand;
        this.stock = stock;
        this.expirationDate = expirationDate;
        this.discountPercentage = discountPercentage;
        this.price = price;
    }
    
    public Product() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return this.category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public LocalDate getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getDiscountPercentage() {
        return this.discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage) {
        this.discountPercentage = discountPercentage;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", category='" + getCategory() + "'" +
            ", name='" + getName() + "'" +
            ", brand='" + getBrand() + "'" +
            ", stock='" + getStock() + "'" +
            ", expirationDate='" + getExpirationDate() + "'" +
            ", discountPercentage='" + getDiscountPercentage() + "'" +
            ", price='" + getPrice() + "'" +
            "}";
    }
}
