package ml.yixiu.servlet;

import java.io.IOException;


public class Hello extends javax.servlet.http.HttpServlet {
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws IOException {
        response.getWriter().print("Hello World");
    }
}

