package com.fpol.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {
    "/crud/create",
    "/crud/update",
    "/crud/delete",
    "/crud/edit/2024"
})
public class CrudServlet extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        
        PrintWriter out = resp.getWriter();
        String uri = req.getRequestURI();
        String message = "";
        
        // Determine which operation was requested based on the URI
        if (uri.endsWith("/crud/create")) {
            message = "Đang thực hiện thao tác THÊM MỚI dữ liệu";
        } else if (uri.endsWith("/crud/update")) {
            message = "Đang thực hiện thao tác CẬP NHẬT dữ liệu";
        } else if (uri.endsWith("/crud/delete")) {
            message = "Đang thực hiện thao tác XÓA dữ liệu";
        } else if (uri.endsWith("/crud/edit/2024")) {
            message = "Đang thực hiện thao tác CHỈNH SỬA dữ liệu của năm 2024";
        }
        
        out.println("<div>" + message + "</div>");
    }
}