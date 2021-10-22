package com.webapp.webshop.data;

import com.webapp.webshop.domain.ShopCategory;
import com.webapp.webshop.domain.ShopItem;
import com.webapp.webshop.handler.FileHandler;

import java.util.ArrayList;
import java.util.List;

public class Bootstrap {

    private List<ShopItem> generateShopItems() {
        List<ShopItem> shopItems = new ArrayList<>();
        shopItems.add(new ShopItem("Healthy snack", ShopCategory.FOOD, 100));
        shopItems.add(new ShopItem("Healthy pizza", ShopCategory.FOOD, 120));
        shopItems.add(new ShopItem("Sweet potatoes", ShopCategory.FOOD, 12));
        shopItems.add(new ShopItem("Pretty dress", ShopCategory.FASHION, 1000));
        shopItems.add(new ShopItem("Fancy pants", ShopCategory.FASHION, 800));
        shopItems.add(new ShopItem("Pretty shirt", ShopCategory.FASHION, 1203));
        shopItems.add(new ShopItem("Fancy coat", ShopCategory.FASHION, 766));
        shopItems.add(new ShopItem("Smart PC", ShopCategory.PC, 387));
        shopItems.add(new ShopItem("Powerful PC", ShopCategory.PC, 836));
        shopItems.add(new ShopItem("Workstation", ShopCategory.PC, 2652));
        shopItems.add(new ShopItem("Graphic Workstation", ShopCategory.PC, 21234));
        shopItems.add(new ShopItem("Latest Console", ShopCategory.GAMING, 6347));
        shopItems.add(new ShopItem("Pacalici", ShopCategory.TOYS, 2));
        shopItems.add(new ShopItem("Far Cry", ShopCategory.GAMING, 123));
        shopItems.add(new ShopItem("Old Console", ShopCategory.GAMING, 60));
        shopItems.add(new ShopItem("Fancy Laptop", ShopCategory.LAPTOP, 100000));
        shopItems.add(new ShopItem("Powerful Laptop", ShopCategory.LAPTOP, 100000));
        shopItems.add(new ShopItem("Graphic Design Laptop", ShopCategory.LAPTOP, 100000));
        shopItems.add(new ShopItem("Airy Ball", ShopCategory.SPORTS, 10));
        shopItems.add(new ShopItem("Sneakers", ShopCategory.SPORTS, 102));
        shopItems.add(new ShopItem("Hunting wellies", ShopCategory.SPORTS, 345));
        shopItems.add(new ShopItem("Airsoft trench", ShopCategory.SPORTS, 1234));
        shopItems.add(new ShopItem("Running shirt", ShopCategory.SPORTS, 23));

        return shopItems;
    }

    public void initializeDatabase() {
        FileHandler.saveObjectsToFile(generateShopItems(), "shop_items");
    }
}
