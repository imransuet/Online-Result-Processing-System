/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 *
 * @author Tarequzzaman
 */
@WebServlet(name = "delete_lab", urlPatterns = {"/delete_lab"})
public class delete_lab extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String session_ = request.getParameter("session");
            request.setAttribute("session", session_);
            String sem = request.getParameter("semester");
            request.setAttribute("semester", sem);
            String reg = request.getParameter("registration");
            request.setAttribute("reg", reg);

            String course_id = request.getParameter("course_id");
            request.setAttribute("course_id", course_id);

            long registration = Long.parseLong(reg);
            long semester = Integer.parseInt(sem);

            try {


                Class.forName("oracle.jdbc.driver.OracleDriver");
                Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pro", "sec");
                Statement st = con.createStatement();
                String sql = "SELECT registration_no from Lab where session_='" + session_ + "' and semester=" + semester + " and course_id='" + course_id + "'";
                ResultSet rs = st.executeQuery(sql);
                int cou = 0;
                while (rs.next()) {
                    long student_id = rs.getInt(1);
                    out.print("<h1>" + student_id + "</h1>");
                    if (student_id == registration) {
                        request.getRequestDispatcher("delete_lab_from_db.jsp").forward(request, response);
                        response.sendRedirect("delete_lab_from_db.jsp");
                        cou = 1;
                        break;
                    }

                }
                if (cou == 0) {
                    response.sendRedirect("datanotfound.jsp");
                }
            } catch (Exception e) {
                out.print(e);
            }

        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
