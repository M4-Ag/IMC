/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Serv;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Calculos.IMC;
import javax.servlet.http.Cookie;

/**
 *
 * @author Mario
 */
@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
                
        String Nombre= request.getParameter("nombre");
        Cookie ck = new Cookie("nombre",Nombre);
        response.addCookie(ck);
        
        String Sexo= request.getParameter("sexo");
        ck = new Cookie("sexo",Sexo);
        response.addCookie(ck);
        
        String Estatura0= request.getParameter("estatura");
        ck = new Cookie("estatura",Estatura0);
        response.addCookie(ck);
        
        String Peso0= request.getParameter("peso");
        ck = new Cookie("peso",Peso0);
        response.addCookie(ck);
        
        String Edad= request.getParameter("edad");
        ck = new Cookie("edad",Edad);
        response.addCookie(ck);
        
        double Estatura = Integer.parseInt(Estatura0)/100;
        double Peso = Integer.parseInt(Peso0);
        
        IMC calc = new IMC();
        
        double Resultado = calc.ResultadoJava(Peso, Estatura);
        ck = new Cookie("resultado",Resultado+"");
        response.addCookie(ck);
        
        request.setAttribute("ResultadoIMC", calc);
        request.getRequestDispatcher("ShowResult.jsp").forward(request,response);
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
