/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoleur;


import entity.*;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.Hibernate;

/**
 *
 * @author Asus
 */
public class servletcontroller extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servletcontroller</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet servletcontroller at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
        controleur emp=new controleur();
        
        String userPath = request.getServletPath();
       if (userPath.equals("/ajouterFormateur"))
       {
            
            Compte c=new Compte();
            
            String login = request.getParameter("login");
            String pass = request.getParameter("pass");
            c.setId(Integer.parseInt(pass));
            c.setLogin(login);
            c.setMotdepasse(pass);
            emp.ajoutcompte(c);
            
            String nom  = request.getParameter("nom");
            String email  = request.getParameter("email");
            int anc = Integer.parseInt(request.getParameter("ancienette"));
            String domaine  = request.getParameter("domaine");
            
          
            
            String select[] = request.getParameterValues("id"); 
            Set formations = new HashSet(0);
            //Set modules = new HashSet(0);
            if (select != null && select.length != 0) {

                for (String select1 : select) {
                System.out.println(select1);
                Formation f=new Formation();
                f=emp.getformation(Integer.parseInt(select1));
                formations.add(f);
                }
                 }
              Formateur f=new Formateur(Integer.parseInt(pass),c,nom,email,anc,domaine,formations);
              emp.ajoutformateur(f);
            
            
            
            
            
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            PrintWriter out = response.getWriter();
            out.print(" <p class=\"alert alert-success\">ajout avec succe </p>");
            
            requestDispatcher.forward(request, response);
       
       }
       if (userPath.equals("/connecter"))
       {
       
       String login = request.getParameter("login");
       String pass = request.getParameter("pass");
       boolean res= emp.existe(login, pass);
       PrintWriter out = response.getWriter();
       
     if (res==true)
     {
         Compte c=new Compte();
         c=emp.connecter(pass);
      if (c.getFormateurs().size()!=0)
      {
      
      RequestDispatcher requestDispatcher = request.getRequestDispatcher("userf.jsp?id="+pass);
      requestDispatcher.forward(request, response);
     }
     else
      {
       RequestDispatcher requestDispatcher = request.getRequestDispatcher("usera.jsp?id="+pass);
       requestDispatcher.forward(request, response);
      
      }
  }
       else
     {
   
    RequestDispatcher requestDispatcher = request.getRequestDispatcher("identification.jsp");
    requestDispatcher.forward(request, response); 
     
     }
       }
        if (userPath.equals("/rechercher"))
         {
         //String disp = request.getParameter("nom");
             String id="0";
         RequestDispatcher requestDispatcher = request.getRequestDispatcher("recherche.jsp?id="+id);
          //requestDispatcher.forward(request, response);
               
            //RequestDispatcher requestDispatcher = request.getRequestDispatcher("recherche.jsp");
            PrintWriter out = response.getWriter();
            requestDispatcher.forward(request, response);
         }
         if (userPath.equals("/ajouterAprenant"))
       {
            
            Compte c=new Compte();
            
            String login = request.getParameter("login");
            String pass = request.getParameter("pass");
            c.setId(Integer.parseInt(pass));
            c.setLogin(login);
            c.setMotdepasse(pass);
            emp.ajoutcompte(c);
            
            String nom  = request.getParameter("nom");
            String email  = request.getParameter("email");
           
            
          
            
            String select[] = request.getParameterValues("id"); 
            String select2[] = request.getParameterValues("id1");
            Set formations = new HashSet(0);
            Set modules =new HashSet(0);
            
            if (select != null && select.length != 0) {

                for (String select1 : select) {
               
                Formation f=new Formation();
                f=emp.getformation(Integer.parseInt(select1));
                formations.add(f);
             
              }
                
                 }
                        if (select2 != null && select2.length != 0) {

                for (String select3 : select2) {
               
                Module f=new Module();
                f=emp.getmodule(Integer.parseInt(select3));
                modules.add(f);
             
              }
                
                 }
              Apprenant a=new Apprenant(Integer.parseInt(pass),c,nom,email,formations,modules);
              emp.ajoutapprenant(a);
            
            
            
                     
            RequestDispatcher requestDispatcher = request.getRequestDispatcher("index.jsp");
            PrintWriter out = response.getWriter();
            out.print(" <p class=\"alert alert-success\">ajout avec succe </p>");
            
            requestDispatcher.forward(request, response);
       
       }
        
    
        
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
