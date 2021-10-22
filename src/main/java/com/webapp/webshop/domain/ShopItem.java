package com.webapp.webshop.domain;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class ShopItem implements Serializable {
    private final UUID id;
    private String name;
    private ShopCategory category;
    private double price;

    public ShopItem() {
        id = UUID.randomUUID();
    }

    public ShopItem(String name, ShopCategory category, double price) {
        id = UUID.randomUUID();
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShopCategory getCategory() {
        return category;
    }

    public void setCategory(ShopCategory category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopItem shopItem = (ShopItem) o;
        return Double.compare(shopItem.price, price) == 0 && Objects.equals(id, shopItem.id) && Objects.equals(name, shopItem.name) && category == shopItem.category;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, category, price);
    }

    @Override
    public String toString() {
        return "ShopItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category=" + category +
                ", price=" + price +
                '}';
    }
}