/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.servlet;

import app.logic.Steganography;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import javax.imageio.ImageIO;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MultipartConfig
@WebServlet(name = "DecryptServlet", urlPatterns = {"/DecryptServlet"})
public class DecryptServlet extends HttpServlet {

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
        PrintWriter out = response.getWriter();
        String txt = "";
        try {
            Steganography stg = new Steganography();
            InputStream pass_stream = request.getPart("password").getInputStream();
            byte[] pass_byte = new byte[pass_stream.available()];
            pass_stream.read(pass_byte);
            String passwd = new String(pass_byte);
            BufferedImage image = ImageIO.read(request.getPart("srcimage").getInputStream());
            String text = stg.decode(image);
            String[] split = text.split(":::");
            if (split[1].equals(passwd)) {
                txt = split[0];
            } else {
                txt = "Invalid Password";
            }
            request.setAttribute("result", txt);
            RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
            rd.forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            out.close();
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
