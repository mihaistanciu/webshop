package com.webapp.webshop.data;

public class ShopDaoFactory {

    private static ShopDao shopDao;

    public static ShopDao getShopDao() {
        if (shopDao == null) {
            shopDao = new ShopDao();
        }
        return shopDao;
    }
}