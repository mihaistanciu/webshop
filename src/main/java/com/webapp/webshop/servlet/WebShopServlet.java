package com.webapp.webshop.servlet;

import com.webapp.webshop.data.ShopDao;
import com.webapp.webshop.data.ShopDaoFactory;
import com.webapp.webshop.domain.ShopCategory;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

public class WebShopServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        ShopDao shopDao = ShopDaoFactory.getShopDao();

        request.setAttribute("categories", ShopCategory.values());
        request.setAttribute("shop_items", shopDao.getOffer());

        ServletContext context = getServletContext();
        RequestDispatcher dispatch = context.getRequestDispatcher("/index.jsp");
        dispatch.forward(request, response);
    }
}