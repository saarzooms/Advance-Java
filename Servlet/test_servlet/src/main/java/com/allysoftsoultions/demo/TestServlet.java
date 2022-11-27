package com.allysoftsoultions.demo;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TestServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String a = req.getParameter("firstName");
        //String b = req.getParameter("lastName");
        int a = Integer.parseInt(req.getParameter("n1"));
        int b = Integer.parseInt(req.getParameter("n2"));
        int c = a+b;
        PrintWriter out = resp.getWriter();
        out.print("<h1>Welcome "+c+"</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nm = req.getParameter("username");
        String pwd = req.getParameter("pwd");
        PrintWriter out = resp.getWriter();
        if(nm.equals(pwd)){
            out.print("Welcome");

        }else{
            out.print("invlid");
        }
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//       String method = req.getMethod();
//       if(method=="POST"){
//           doPost(req,resp);
//       }else{
//           doGet(req,resp);
//       }
//        PrintWriter out = resp.getWriter();
//        out.print("from service");
        resp.sendRedirect("http://google.com");
    }
}

