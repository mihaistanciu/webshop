package com.webapp.webshop.servlet;

import com.webapp.webshop.data.ShopDao;
import com.webapp.webshop.data.ShopDaoFactory;
import com.webapp.webshop.domain.ShopCategory;
import com.webapp.webshop.domain.ShopItem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class ShopItemsAjaxServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ShopCategory category = ShopCategory.valueOf(request.getParameter("category"));

        ShopDao shopDao = ShopDaoFactory.getShopDao();

        request.setAttribute("shop_items", shopDao.getOffer(category));

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/products.jsp");
        dispatch.forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ShopDao shopDao = ShopDaoFactory.getShopDao();

        shopDao.order(UUID.fromString(request.getParameter("productId")));

        List<ShopItem> order = shopDao.getOrder();
        request.setAttribute("ordered_items", order);

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/orderedProducts.jsp");
        dispatch.forward(request, response);
    }
}
