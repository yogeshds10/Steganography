/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.servlet;

import db.ConnectDB;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Yogi
 */
@WebServlet(name = "RegisterData", urlPatterns = {"/RegisterData"})
public class RegisterData extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String message = "";
        int x = 0;
        boolean reg = false;
        try {
            PreparedStatement ps = ConnectDB.getConnection().prepareStatement("INSERT INTO users value(?,?,?,?,?,?,?,?)");
            ps.setString(1, request.getParameter("uid"));
            ps.setString(2, request.getParameter("password"));
            ps.setString(3, request.getParameter("name"));
            ps.setString(4, request.getParameter("dob"));
            ps.setString(5, request.getParameter("gender"));
            ps.setString(6, request.getParameter("address"));
            ps.setDouble(7, Double.parseDouble(request.getParameter("phone")));
            ps.setString(8, request.getParameter("email"));
            x = ps.executeUpdate();
            if (x == 1) {
                reg = true;
                String uname = request.getParameter("name");
                request.getSession().setAttribute("uname", uname);
                response.sendRedirect("home.jsp");
            } else {
                message += "User already exist!!! Please try with some othet user ID<br/>";                
            }
        } catch (Exception e) {
            message += "Error while passing the Data!!!";
        } finally {
            if (!reg) {
                request.setAttribute("msg", message);
                RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
                rd.forward(request, response);
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
