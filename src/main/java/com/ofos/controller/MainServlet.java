package com.ofos.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class MainServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String customerName = req.getParameter("customerName");
        String foodItem = req.getParameter("foodItem");
        String quantity = req.getParameter("quantity");

        String systemMsg = "Your food order has been placed successfully!";

        req.setAttribute("message", systemMsg);
        req.setAttribute("customer", customerName);
        req.setAttribute("item", foodItem);
        req.setAttribute("qty", quantity);

        RequestDispatcher dispatcher = req.getRequestDispatcher("page.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.sendRedirect("index.jsp");
    }
}
