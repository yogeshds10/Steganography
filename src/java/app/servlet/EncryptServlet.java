/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package app.servlet;

import app.logic.Steganography;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@MultipartConfig
@WebServlet(name = "EncryptServlet", urlPatterns = {"/EncryptServlet"})
public class EncryptServlet extends HttpServlet {

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
        response.setContentType("image/png");
        response.setHeader("Content-Disposition", "attachment; filename=Encrypted.png");
//        PrintWriter out = response.getWriter();
        try {
            Steganography stg = new Steganography();
            BufferedImage image = ImageIO.read(request.getPart("srcimage").getInputStream());
            InputStream text_stream = request.getPart("srctext").getInputStream();
            byte[] text_byte = new byte[text_stream.available()];
            text_stream.read(text_byte);
            String text = new String(text_byte);
            InputStream pass_stream = request.getPart("password").getInputStream();
            byte[] pass_byte = new byte[pass_stream.available()];
            pass_stream.read(pass_byte);
            String passwd = new String(pass_byte);
            text += ":::"+passwd;
            BufferedImage resimg = stg.add_text(image, text);
            ImageIO.write(resimg, "png", response.getOutputStream());            


//            Uncomment the next line to get the text out of encoded image.
//            out.println(stg.decode(resimg));
            
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
//            out.close();
              response.setContentType("text/html;charset=UTF-8");
              response.sendRedirect("index.jsp");
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
