package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    PrintWriter out;

    res.setContentType("text/html; charset=utf-8");
    out = res.getWriter();

    String val_SalesShopCode__c = req.getParameter("SalesShopCode__c");
    String val_SalesOrgCode__c = req.getParameter("SalesOrgCode__c");

    StringBuffer sb = new StringBuffer();
    sb.append("<html>");
    sb.append("<head>");
    sb.append("<head>");
    sb.append("<meta charset=\"utf-8\"/>");
    sb.append("</head>");
    sb.append("<body>");

    sb.append("<p>SalesShopCode:");
    sb.append(val_SalesShopCode__c);
    sb.append("</p>");

    sb.append("<p>SalesOrgCode");
    sb.append(val_SalesOrgCode__c);
    sb.append("</p>");

    sb.append("</body>");
    sb.append("</html>");

    out.println(new String(sb));
  }
}