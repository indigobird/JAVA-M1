/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Exception.ConnectionNotFoundException;
import Model.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author fasalles
 */
@WebServlet(name = "modules", urlPatterns = {"/modules"})
public class modules extends MyServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        checkSession(request);
        
        if(!checkPermission("enseignant"))
            response.sendRedirect(request.getContextPath()+"/index");
        
        try
        {
            Set<Module> modules = ModuleTable.findModulesByTeacher((Enseignant)session.getAttribute("user"));
            
            request.setAttribute("modules", modules);
            goToPage("/modules.jsp", request, response); 
        } 
        catch (ConnectionNotFoundException ex) {
            Logger.getLogger(notes.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(notes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Controller of Modules";
    }// </editor-fold>
}
