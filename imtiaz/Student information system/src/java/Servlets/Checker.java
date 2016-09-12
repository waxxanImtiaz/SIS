/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import controller.*;
import java.util.*;
import beans.*;
import org.hibernate.Transaction;
/**
 *
 * @author waxxan
 */
public class Checker extends HttpServlet {

    private String username;
    private String password;
    private StudentChecker studentChecker;
    private PrintWriter printWriter;
    Integer visitCount = new Integer(0);
    String visitCountKey = new String("visitCount");
    private InitialiazerHibernateSession initializer;
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        setUsername(request.getParameter("username"));
        setPassword(request.getParameter("password"));
        setPrintWriter(response.getWriter());
        
        
       
        //set initializer
        initializer = new InitialiazerHibernateSession(request,response);

        //set master..
        CheckMaster master = new CheckMaster(getUsername(),getPassword(),initializer);
        if(master.isMaster())
        {
            storeUserInformation(request);
            if(request.getSession().isNew())
            {
             
             request.getSession().setAttribute("username", getUsername());
             request.getSession().setAttribute(visitCountKey,  visitCount);
            }
            else
            {
                visitCount = (Integer)request.getSession().getAttribute(visitCountKey);
                visitCount = visitCount + 1;
                request.getSession().setAttribute(visitCountKey,  visitCount);
            }
           // setStudentChecker((StudentChecker)request.getServletContext().getAttribute("studentChecker"));
            //getStudentChecker().goToStudentProfile();
        }else
        {
            storeUserInformation(request);
            if(master.getStudentChecker().isStudent())
            {
               request.getSession().setAttribute("session", "true");
               master.getStudentChecker().goToStudentProfile();
            }else{
                showMessage("user is not student or invalid username or password");
            }
            
        }


     }//end of doPost method
     private void storeUserInformation(HttpServletRequest request)
     {
      
         LoginInformation login = new LoginInformation();
         Enumeration headerNames = request.getHeaderNames();
        
        //  getPrintWriter().println("<table border=\'1\'>");
        while(headerNames.hasMoreElements()) {
          String paramName = (String)headerNames.nextElement();
           String paramValue = request.getHeader(paramName);
          if(paramName.equals("host"))
          {
              login.setHost(paramValue);
          }
          else if(paramName.equals("user-agent"))
          {
              login.setUserAgent(paramValue);
          }
          else if(paramName.equals("cookie"))
          {
              login.setCookie(paramValue);
          }
          else if(paramName.equals("accept"))
          {
              login.setAccept(paramValue);
          }else if(paramName.equals("accept-encoding"))
          {
              login.setAcceptEncoding(paramValue);
          }
          else if(paramName.equals("cookie"))
          {
              login.setCookie(paramValue);
          }
          else if(paramName.equals("cache-control"))
          {
              login.setCacheControl(paramValue);
          }
          else if(paramName.equals("connection"))
          {
              login.setConnection(paramValue);
          }
          
          }//end of while loop
        
        
        login.setUsername(this.getUsername());
        login.setPassword(this.getPassword());
        
      	
       
//         
	
        Session s= initializer.getSessionFactory().openSession();
        try {
              
              Transaction tran=s.beginTransaction();
              s.save(login);
              tran.commit();
            }
            catch (RuntimeException e) {
                s.getTransaction().rollback();
                throw e;
            }
        
     }//end of storeUserInformation method..
       private void  showMessage( String message ){
            getPrintWriter().println(message);
       }//end of showMessage

    @Override
    public String getServletInfo() {
        return "This is Id and password checker servlet";
    }// end getServletInfo method

    /**
     * @return the username
     */
    private String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    private void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    private String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    private void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the printWriter
     */
    private PrintWriter getPrintWriter() {
        return printWriter;
    }

    /**
     * @param printWriter the printWriter to set
     */
    private void setPrintWriter(PrintWriter printWriter) {
        this.printWriter = printWriter;
    }

    /**
     * @return the studentChecker
     */
    private StudentChecker getStudentChecker() {
        return studentChecker;
    }

    /**
     * @param studentChecker the studentChecker to set
     */
    private void setStudentChecker(StudentChecker studentChecker) {
        this.studentChecker = studentChecker;
    }

}
