package org.lvillarreal.webapp.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/parametros/url-get")
public class ParamentrosGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String saludos = req.getParameter("Saludos");
        String nombre = req.getParameter("noombre");

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("         <head>");
        out.println(              "<meta charset=\"UTF-8\">");
        out.println(              "<title>Parametros Get de lal url</title>");
        out.println("         </head>");
        out.println("                 <body>");
        out.println("                     <h1>Parametros Get de la url!</h1>");

        if( saludos != null && nombre != null){
            out.println("                     <h2>El saludo enviado es:" + saludos + " "+ nombre + "!!!</h2>");
        } else if (saludos != null) {
            out.println("                     <h2>El saludo enviado es:" + saludos + "!!!</h2>");
        }else {
            out.println("<h2>No se han pasado los parametros saludos ni nombre </h2>");
        }

        out.println("                 </body>");
        out.println("</html>");
        out.close();
    }
}
