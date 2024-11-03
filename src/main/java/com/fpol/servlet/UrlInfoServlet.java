package com.fpol.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/infor")
public class UrlInfoServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        
        out.println("<h2>URL Information</h2>");
        out.println("<div><strong>URL:</strong> " + req.getRequestURL().toString() + "</div>");
        out.println("<div><strong>URI:</strong> " + req.getRequestURI() + "</div>");
        String queryString = req.getQueryString();
        out.println("<div><strong>QueryString:</strong> " + 
            (queryString != null ? queryString : "No query string") + "</div>");
        out.println("<div><strong>ServletPath:</strong> " + req.getServletPath() + "</div>");
        out.println("<div><strong>ContextPath:</strong> " + req.getContextPath() + "</div>");
        String pathInfo = req.getPathInfo();
        out.println("<div><strong>PathInfo:</strong> " + 
            (pathInfo != null ? pathInfo : "No path info") + "</div>");
        out.println("<div><strong>Method:</strong> " + req.getMethod() + "</div>");
    }
}