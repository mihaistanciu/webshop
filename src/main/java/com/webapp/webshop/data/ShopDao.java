package com.webapp.webshop.data;

import com.webapp.webshop.domain.ShopCategory;
import com.webapp.webshop.domain.ShopItem;
import com.webapp.webshop.handler.FileHandler;

import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

public class ShopDao {

    public ShopDao() {
        //Useful to initialize the database with some mock data
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.initializeDatabase();
        FileHandler.readObjectsFromFile(ShopItem.class, "shop_items");
    }

    public List<ShopItem> getOffer(ShopCategory category) {
        return FileHandler.readObjectsFromFile(ShopItem.class, "shop_items").stream().filter(x -> x.getCategory() == category).collect(Collectors.toList());
    }

    public List<ShopItem> getOffer() {
        return FileHandler.readObjectsFromFile(ShopItem.class, "shop_items");
    }

    public void order(UUID id) {
        Optional item = FileHandler.readObjectsFromFile(ShopItem.class, "shop_items").stream().filter(x -> x.getId().equals(id)).findFirst();
        if (item.isPresent()) {
            FileHandler.saveObjectToFile(item.get(), "orders");
        }
    }

    public List<ShopItem> getOrder() {
        return FileHandler.readObjectsFromFile(ShopItem.class, "orders");
    }
}